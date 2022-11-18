package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.entities.Project;
import be.ipeters.crudapplication.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
//		Iterable<Project> projects = proRepo.findAll(); //standard, but then we define a List in the Repository
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList",projects);
		return "main/home";
	}

}
