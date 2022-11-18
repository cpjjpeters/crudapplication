package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.entities.Employee;
import be.ipeters.crudapplication.entities.Project;
import be.ipeters.crudapplication.repository.EmployeeRepository;
import be.ipeters.crudapplication.repository.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;

	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);
	@GetMapping
	public String displayProjects(Model model) {
		log.debug("displayProjects");
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		return "projects/list-projects";
	}
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();

		model.addAttribute("project", aProject);
//		model.addAttribute("allEmployees", employees);
		
		return "projects/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, Model model) {    //(Project project, @RequestParam List<Long> employees, Model model) {
		proRepo.save(project);
//		Iterable<Employee> chosenEmployees = empRepo.findAllById(employees);
//		for (Employee emp : chosenEmployees) {
//			emp.setProject(project);
//			empRepo.save(emp);
//		}
		
		
//		use a redirect to prevent duplicate submissions
		return "redirect:/projects/new";
	}

}
