package be.ipeters.crudapplication.services;


import be.ipeters.crudapplication.controller.StadController;
import be.ipeters.crudapplication.entities.Stad;
import be.ipeters.crudapplication.repository.StadRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

//@Slf4j
@Service
public class StadService {
    private static final Logger log = LoggerFactory.getLogger(StadService.class);
    private final StadRepository stadRepository;

    public StadService(StadRepository stadRepository) {
        this.stadRepository = stadRepository;
    }

    public List<Stad> findAll(){
        log.debug("stad findall");
        return this.stadRepository.findAll();
    }

    public Stad save(Stad stad) {

        log.debug("save {}", stad);
        return this.stadRepository.save(stad);
    }
}
