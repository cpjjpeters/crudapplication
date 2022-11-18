package be.ipeters.crudapplication.repository;

import be.ipeters.crudapplication.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Override
	public List<Employee> findAll();
	
	@Query(nativeQuery=true, value="SELECT e.first_name as firstName, e.last_name as lastName"+
	"FROM employee e"+
	"ORDER BY 3DESC")
	public List<Employee> employeeProjects();
	

}
