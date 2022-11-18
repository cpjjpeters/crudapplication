package be.ipeters.crudapplication.repository;

import be.ipeters.crudapplication.entities.CityJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityJpaRepository extends JpaRepository<CityJpaEntity, Long> {

//    @Override
//    public List<CityJpaEntity> findAll();

}
