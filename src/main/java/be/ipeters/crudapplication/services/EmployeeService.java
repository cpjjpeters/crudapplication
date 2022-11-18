package be.ipeters.crudapplication.services;

import be.ipeters.crudapplication.entities.Employee;
import be.ipeters.crudapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public Employee save(Employee employee) {
		return empRepo.save(employee);
		
	}
	
	public List<Employee> getAll(){
		return empRepo.findAll();
	}

//	public List<EmployeeProject> employeeProjects(){
//		return empRepo.employeeProjects();
//	}
}
