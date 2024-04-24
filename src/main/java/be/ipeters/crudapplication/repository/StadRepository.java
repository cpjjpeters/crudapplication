package be.ipeters.crudapplication.repository;

import be.ipeters.crudapplication.entities.Stad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadRepository extends JpaRepository<Stad, Long> {
    void deleteById(Long id);
}
