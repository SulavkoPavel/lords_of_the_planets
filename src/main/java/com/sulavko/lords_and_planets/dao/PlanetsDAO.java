package com.sulavko.lords_and_planets.dao;


import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;

public interface PlanetsDAO {

    public void addPlanet(Planet planet);

    public void addLordPlanet(Planet planet);

    public void deletePlanet(int id);

    public Planet getPlanet(int id);
}
