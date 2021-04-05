package com.sulavko.lords_and_planets.service;

import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;

import java.util.List;

public interface DAOService {

    public List<Lord> getAllLords();

    public void addLord(Lord lords);

    public void addPlanet(Planet planet);

    public void addLordPlanet(Planet planet);

    public List<Lord> getAllLordsOfUnemployment();

    public void deletePlanet(int id);

    public Planet getPlanet(int id);





}
