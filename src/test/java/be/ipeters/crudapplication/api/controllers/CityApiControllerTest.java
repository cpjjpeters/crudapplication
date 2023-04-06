package be.ipeters.crudapplication.api.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import be.ipeters.crudapplication.controller.CityController;
import be.ipeters.crudapplication.mapper.CityRestMapper;
import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.model.ui.CityRest;
import be.ipeters.crudapplication.services.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

class CityApiControllerTest {

    @InjectMocks // This allows to inject Mock objects.
    CityApiController cityApiController;

    @InjectMocks // This allows to inject Mock objects.
    CityController cityController;
    @Mock
    CityService cityService;


    City city;

    @BeforeEach
    void setUp() throws Exception {
        /*
         *  This is needed for Mockito to be able to instantiate the Mock Objects
         *  and Inject into the userController object
         */
        MockitoAnnotations.initMocks(this);

        City city = new City();
        city.setName("Wommelgem");
        city.setId(1L);
        city.setPopulation(20000);

    }
//
//    @Test
//    void getCityById(){
//        when(cityService.findById(1L)).thenReturn(city );
//
//        CityRest cityRest  = cityController.findCityById(1L);
//        assertNotNull(cityRest);
//        assertEquals(city.getName(),cityRest.getName());
//        assertEquals(city.getPopulation(), cityRest.getPopulation());
//    }
}