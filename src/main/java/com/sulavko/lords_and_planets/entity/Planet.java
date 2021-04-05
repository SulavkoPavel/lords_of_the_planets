package com.sulavko.lords_and_planets.entity;


import javax.persistence.*;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name_planet")
    private String namePlanet;
    @JoinColumn(name = "id_lord")
    private int idLord;

    public Planet() {
    }

    public Planet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public Planet(int idLord) {
        this.idLord = idLord;
    }

    public Planet(String namePlanet, int idLord) {
        this.namePlanet = namePlanet;
        this.idLord = idLord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public int getIdLord() {
        return idLord;
    }

    public void setIdLord(int idLord) {
        this.idLord = idLord;
    }
}
