package be.ipeters.crudapplication.model.ui;

/* carlpeters created on 05/12/2022 inside the package - be.ipeters.crudapplication.model.ui */
public class CityRest {
    private Long id;
    private String name;
    private int population;

    public CityRest(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public CityRest( String name, int population) {
        this.name = name;
        this.population = population;
    }
    public CityRest() {
    }
    //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
