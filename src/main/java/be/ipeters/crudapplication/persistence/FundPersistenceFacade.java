package be.ipeters.crudapplication.persistence;

import be.ipeters.crudapplication.model.Fund;

import java.util.List;
import java.util.Optional;

public interface FundPersistenceFacade {
    Fund save(Fund fund);

    List<Fund> findAll();

    Optional<Fund> findById(Long id);
}
