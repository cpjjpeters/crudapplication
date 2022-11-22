package be.ipeters.crudapplication.repository;

import be.ipeters.crudapplication.entities.FundJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundJpaRepository extends JpaRepository<FundJpaEntity, Long> {
}
