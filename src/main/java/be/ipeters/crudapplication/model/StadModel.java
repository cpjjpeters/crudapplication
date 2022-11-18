package be.ipeters.crudapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 15/11/2022 inside the package - be.ipeters.crudapplication.model */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StadModel {
    private Long id;
    private String name;
    private int population;
}
