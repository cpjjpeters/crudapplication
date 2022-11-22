package be.ipeters.crudapplication.services;

import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.persistence.CityPersistenceFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* carlpeters created on 16/11/2022 inside the package - be.ipeters.crudapplication.services */
@Slf4j
@Service
public class CityService {

    private CityPersistenceFacade cityPersistenceFacade ;

    public CityService(CityPersistenceFacade cityPersistenceFacade) {
        this.cityPersistenceFacade = cityPersistenceFacade;
    }

    public List<City> findAll() {
        return this.cityPersistenceFacade.findAll();
    }

    public City findById(Long id) {
        City city = this.cityPersistenceFacade.findById(id);
        return city;
    }

    public City save(City city) {
        return this.cityPersistenceFacade.save(city);
    }

    public City update(City city) {
        return this.cityPersistenceFacade.save(city);
    }

    public void deleteById(Long id) {
    }

    public void delete(City city){
        
    }
}
