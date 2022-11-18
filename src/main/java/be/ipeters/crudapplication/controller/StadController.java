package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.entities.Stad;
import be.ipeters.crudapplication.repository.StadRepository;
import be.ipeters.crudapplication.services.StadService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@Slf4j
@Controller
@RequestMapping(value = "/steden")//, produces = MediaType.APPLICATION_JSON_VALUE)
public class StadController {

    private static final Logger log = LoggerFactory.getLogger(StadController.class);
    private final StadService stadService;
    private final StadRepository stadRepository;


    public StadController(StadService stadService, StadRepository stadRepository) {
        this.stadService = stadService;
        this.stadRepository = stadRepository;
    }

    @GetMapping
    public String displaySteden(Model model) {
        log.debug("displaySteden");
        List<Stad> steden = stadRepository.findAll();
//        List<be.ipeters.crudapplication.entities.Stad> steden = stadService.findAll();
        model.addAttribute("steden", steden);
        return "steden/list-steden";
    }

    @GetMapping("/new")
    public String displayCityForm(Model model) {
        log.debug("displayCityForm");
        Stad aStad = new Stad();
        model.addAttribute("stad", aStad);
        return "steden/new-stad";
    }

    @PostMapping("/save")
    public String createStad(be.ipeters.crudapplication.entities.Stad stad, Model model) {
        log.debug("handle saving to DB");
//        cityJpaRepository.save(cityJpaDaoMapper.modelToJpaEntity(city));
        stadRepository.save(stad);

//        stadService.save(stad);
        return "redirect:/steden";  // going up to GetMapping slash new
    }
}
