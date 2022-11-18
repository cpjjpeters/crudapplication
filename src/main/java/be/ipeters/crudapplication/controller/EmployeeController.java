package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.entities.Employee;
import be.ipeters.crudapplication.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//@Slf4j
@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	@GetMapping
	public String displayEmployees(Model model) {
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employees", employees);
		return "employees/list-employees";
	}
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee aEmployee = new Employee();
		model.addAttribute("employee", aEmployee);
		log.info("getmapping new employee");
		return "employees/new-employee";
	}
	
	@PostMapping("/save")
	public String createEmployee(Employee employee, Model model) {
		empRepo.save(employee);
//		use a redirect to prevent duplicate submissions
		return "redirect:/employees/new";
	}

}
