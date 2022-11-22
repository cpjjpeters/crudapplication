package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.services.CityJpaPersistenceService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/cities")//, produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {


//private static final Logger log = LoggerFactory.getLogger(CityController.class);
    private final CityJpaPersistenceService cityJpaPersistenceService;

    public CityController(CityJpaPersistenceService cityJpaPersistenceService) {
        this.cityJpaPersistenceService = cityJpaPersistenceService;
    }

    @GetMapping
    public String displayCities(Model model){
        log.debug("displayCities");
        List<City> cities = cityJpaPersistenceService.findAll();

        model.addAttribute("cities", cities);
        return "cities/list-cities";
    }

    @GetMapping("/new")
    public String displayCityForm(Model model) {
        City aCity = new City();
        model.addAttribute("city", aCity);
        return "cities/new-city";
    }

    @PostMapping("/save")
    public String createCity(City city, Model model) {
        log.debug("handle saving to DB");
//        cityJpaRepository.save(cityJpaDaoMapper.modelToJpaEntity(city));

        cityJpaPersistenceService.save(city);
        return "redirect:/cities";  // going up to GetMapping slash new
    }

}
