package be.ipeters.crudapplication.controller;

import be.ipeters.crudapplication.mapper.CityRestMapper;
import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.model.ui.CityRest;
import be.ipeters.crudapplication.services.CityJpaPersistenceService;
import be.ipeters.crudapplication.services.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.modelmapper.ModelMapper;
@Slf4j
@Controller
@RequestMapping(value = "/cities")//, produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {


//private static final Logger log = LoggerFactory.getLogger(CityController.class);
    private final CityJpaPersistenceService cityJpaPersistenceService;
    private final CityService cityService;
    private final CityRestMapper cityRestMapper;

    public CityController(CityJpaPersistenceService cityJpaPersistenceService, CityService cityService, CityRestMapper cityRestMapper) {
        this.cityJpaPersistenceService = cityJpaPersistenceService;
        this.cityService = cityService;
        this.cityRestMapper = cityRestMapper;
    }

    @GetMapping
    public String displayCities(Model model){
        log.debug("displayCities");
//        List<City> cities = cityJpaPersistenceService.findAll();
        List<City> cities = cityService.findAll();

                model.addAttribute("cities", cities);
        return "cities/list-cities";
    }

    @GetMapping("/{id}")
    public CityRest findCityById(@PathVariable("id") Long id){
        City city = cityService.findById(id);
//        ModelMapper modelMapper = new ModelMapper();
        CityRest cityRest = cityRestMapper.modelToRest(city);//modelMapper.map(city, CityRest.class);
        return cityRest;
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
