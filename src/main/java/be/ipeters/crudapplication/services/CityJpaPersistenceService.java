package be.ipeters.crudapplication.services;


import be.ipeters.crudapplication.controller.StadController;
import be.ipeters.crudapplication.entities.CityJpaEntity;
import be.ipeters.crudapplication.mapper.CityJpaDaoMapper;
import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.persistence.CityPersistenceFacade;
import be.ipeters.crudapplication.repository.CityJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityJpaPersistenceService implements CityPersistenceFacade {
    private final CityJpaRepository cityJpaRepository;
    private final CityJpaDaoMapper cityJpaDaoMapper;
    private static final Logger log = LoggerFactory.getLogger(CityJpaPersistenceService.class);

    public CityJpaPersistenceService(CityJpaRepository cityJpaRepository, CityJpaDaoMapper cityJpaDaoMapper) {
        this.cityJpaRepository = cityJpaRepository;
        this.cityJpaDaoMapper = cityJpaDaoMapper;
    }

    @Override
    public City save(City city) {
        final CityJpaEntity cityJpaEntity = this.cityJpaRepository.save(cityJpaDaoMapper.modelToJpaEntity(city));
        log.debug("City JPA = {}", cityJpaEntity.getName());
        return this.cityJpaDaoMapper.jpaEntityToModel(cityJpaEntity);
    }

    public List<City> findAll() {
        return this.cityJpaRepository.findAll()
                .stream()
                .map(this.cityJpaDaoMapper::jpaEntityToModel).collect(Collectors.toList());
    }

    public void deleteAll() {
        this.cityJpaRepository.deleteAll();
    }
}
