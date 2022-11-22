package be.ipeters.crudapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

/* carlpeters created on 21/11/2022 inside the package - be.ipeters.crudapplication.model */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fund {
    private Long id;
    private String issueId;
    private String statusDexia;
    private String juridicalCode;
    private String companyCode;
    private String issueCode;
    private String issueName;
}
