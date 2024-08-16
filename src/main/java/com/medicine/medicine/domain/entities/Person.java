package com.medicine.medicine.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
// @Table(name = "persons")
public class Person {
    @Id
    @Column(name = "id_person",columnDefinition = "VARCHAR(20)",nullable = false)
    private String idPerson;

    @Column(name = "firstname",columnDefinition = "VARCHAR(50)",nullable = false)
    private String firstname;

    @Column(name = "lastname", columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastname;

    @ManyToOne
    City cities;

    // @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "persons")
    // private List<TypePerson> typePersons;

    @ManyToOne
    TypePerson typePersons;
    
    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public TypePerson getTypePersons() {
        return typePersons;
    }

    public void setTypePersons(TypePerson typePersons) {
        this.typePersons = typePersons;
    }

    
}
