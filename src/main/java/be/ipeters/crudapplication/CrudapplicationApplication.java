package be.ipeters.crudapplication;

import be.ipeters.crudapplication.entities.CityJpaEntity;
import be.ipeters.crudapplication.entities.Employee;
import be.ipeters.crudapplication.entities.Project;
import be.ipeters.crudapplication.entities.Stad;
import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.repository.CityJpaRepository;
import be.ipeters.crudapplication.repository.EmployeeRepository;
import be.ipeters.crudapplication.repository.ProjectRepository;
import be.ipeters.crudapplication.repository.StadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CrudapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudapplicationApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}


	@Autowired
	EmployeeRepository empRepo;

	@Autowired
	ProjectRepository projRepo;

	@Autowired
	StadRepository stadRepository;

	@Autowired
	CityJpaRepository cityJpaRepository;

	@Bean
	CommandLineRunner runner() {

		return args -> {
			Stad stad1 = new Stad("Antwerpen", 529247);
			Stad stad2 = new Stad("Brugge", 118656);
			Stad stad3 = new Stad("Luik", 197217);
			stadRepository.save(stad1);
			stadRepository.save(stad2);
			stadRepository.save(stad3);

			CityJpaEntity city1 = new CityJpaEntity("Gent", 263927);
			cityJpaRepository.save(city1);

			Employee emp1 = new Employee("John", "Warton", "warton@gmail.com");
			Employee emp2 = new Employee("Mike", "Lanister", "lanister@gmail.com");
			Employee emp3 = new Employee("Steve", "Reeves", "Reeves@gmail.com");

			Employee emp4 = new Employee("Ronald", "Connor", "connor@gmail.com");
			Employee emp5 = new Employee("Jim", "Salvator", "Sal@gmail.com");
			Employee emp6 = new Employee("Peter", "Henley", "henley@gmail.com");

			Employee emp7 = new Employee("Richard", "Carson", "carson@gmail.com");
			Employee emp8 = new Employee("Honor", "Miles", "miles@gmail.com");
			Employee emp9 = new Employee("Tony", "Roggers", "roggers@gmail.com");


			Project pro1 = new Project("Large Production Deploy", "NOTSTARTED", "This requires all hands on deck for"
					+ "the final deployment of the software into production");
			Project pro2 = new Project("New Employee Budget",  "COMPLETED", "Decide on a new employee bonus budget"
					+ "for the year and figureout who will be promoted");
			Project pro3 = new Project("Office Reconstruction", "INPROGRESS", "The office building in Monroe has "
					+ "been damaged due to hurricane in the region. This needs to be reconstructed");
			Project pro4 = new Project("Improve Intranet Security", "INPROGRESS", "With the recent data hack, the office"
					+ "security needs to be improved and proper security team needs to be hired for "
					+ "implementation");



			// need to set both sides of the relationship manually

			pro1.addEmployee(emp1);
			pro1.addEmployee(emp2);
			pro2.addEmployee(emp3);
			pro3.addEmployee(emp1);
			pro4.addEmployee(emp1);
			pro4.addEmployee(emp3);

//
//			// need to set both sides of the relationship manually
//
//			emp1.setProjects(Arrays.asList(pro1, pro3, pro4));
//			emp2.setProjects(Arrays.asList(pro1));
//			emp3.setProjects(Arrays.asList(pro2, pro4));

			// save employees in database

			empRepo.save(emp1);
			empRepo.save(emp2);
			empRepo.save(emp3);
			empRepo.save(emp4);
			empRepo.save(emp5);
			empRepo.save(emp6);
			empRepo.save(emp7);
			empRepo.save(emp8);
			empRepo.save(emp9);


			// save projects in database

			projRepo.save(pro1);
			projRepo.save(pro2);
			projRepo.save(pro3);
			projRepo.save(pro4);


		};

	}
}
