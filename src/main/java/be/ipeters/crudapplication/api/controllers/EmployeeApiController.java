package be.ipeters.crudapplication.api.controllers;


import java.util.List;

import be.ipeters.crudapplication.entities.Employee;
import be.ipeters.crudapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* carlpeters created on 15/11/2022 inside the package - be.ipeters.crudapplication.api.controllers */


@RestController
@RequestMapping("/app-api/employees")
public class EmployeeApiController {

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public List<Employee> getEmployees(){
        return empRepo.findAll();
    }
}
