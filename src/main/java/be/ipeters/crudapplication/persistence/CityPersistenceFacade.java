package be.ipeters.crudapplication.persistence;

import be.ipeters.crudapplication.model.City;

import java.util.List;

public interface CityPersistenceFacade {

    City save(City city);

    List<City> findAll();

    City findById(Long id);

    void delete(City city);


}
