package be.ipeters.crudapplication.model;

import lombok.Data;

import javax.persistence.Column;

/* carlpeters created on 16/11/2022 inside the package - be.ipeters.crudapplication.model */
@Data
public class City {
    private Long id;
    private String name;
    private int population;

    public City(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public City( String name, int population) {
        this.name = name;
        this.population = population;
    }
    public City() {
    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(int population) {
//        this.population = population;
//    }
}
