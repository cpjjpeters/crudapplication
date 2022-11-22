package be.ipeters.crudapplication.services;

/* carlpeters created on 21/11/2022 inside the package - be.ipeters.crudapplication.services */

import be.ipeters.crudapplication.model.Fund;
import be.ipeters.crudapplication.persistence.FundPersistenceFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
//@Service
public class FundService {

    private final FundPersistenceFacade fundPersistenceFacade;

    public FundService(FundPersistenceFacade fundPersistenceFacade) {
        this.fundPersistenceFacade = fundPersistenceFacade;
    }

    public Fund createFund(final Fund fund){
        return this.fundPersistenceFacade.save(fund);
    }

    public List<Fund> findAllFunds() {
        return this.fundPersistenceFacade.findAll();
    }

    public Optional<Fund> findById(Long id) {
        return this.fundPersistenceFacade.findById(id);
    }
}
