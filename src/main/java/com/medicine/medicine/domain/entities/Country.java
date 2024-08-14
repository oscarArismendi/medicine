package com.medicine.medicine.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(columnDefinition = "VARCHAR(5)",nullable = false)
    private String codeCountry;

    @Column(columnDefinition ="VARCHAR(50)",nullable = false)
    private String nameCountry;

    @OneToMany(mappedBy = "countries")
    private List<Region> regions;

    public Country() {
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    
}
