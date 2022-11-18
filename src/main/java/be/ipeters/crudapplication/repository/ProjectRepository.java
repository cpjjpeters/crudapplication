package be.ipeters.crudapplication.repository;

import be.ipeters.crudapplication.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	@Override
	public List<Project> findAll();

}
