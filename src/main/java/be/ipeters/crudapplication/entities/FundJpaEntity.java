package be.ipeters.crudapplication.entities;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
/* carlpeters created on 21/11/2022 inside the package - be.ipeters.crudapplication.entities */
@Table(name = "FUND")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class FundJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NM_ID")
    private String issueId;
    @Column(name="ST_DEXIA")
    private String statusDexia;
    @Column(name = "CO_JTYPE")
    private String juridicalCode;
    @Column(name="CO_COMPA")
    private String companyCode;
    @Column(name = "NM_VALUE")
    private String issueCode;
    @Column(name="NM_NAME")
    private String issueName;

    public FundJpaEntity() {
    }

    public FundJpaEntity(Long id, String issueId, String statusDexia, String juridicalCode, String companyCode, String issueCode, String issueName) {
        this.id = id;
        this.issueId = issueId;
        this.statusDexia = statusDexia;
        this.juridicalCode = juridicalCode;
        this.companyCode = companyCode;
        this.issueCode = issueCode;
        this.issueName = issueName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getStatusDexia() {
        return statusDexia;
    }

    public void setStatusDexia(String statusDexia) {
        this.statusDexia = statusDexia;
    }

    public String getJuridicalCode() {
        return juridicalCode;
    }

    public void setJuridicalCode(String juridicalCode) {
        this.juridicalCode = juridicalCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }
}
