package com.sulavko.lords_and_planets.service;

import com.sulavko.lords_and_planets.dao.LordsDAOImpl;
import com.sulavko.lords_and_planets.dao.PlanetsDAOImpl;
import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DAOServiceImpl implements DAOService {

    @Autowired
    LordsDAOImpl lordsDAO;

    @Autowired
    PlanetsDAOImpl planetsDAO;


    @Override
    @Transactional
    public List<Lord> getAllLords() {
        return lordsDAO.getAllLords();
    }

    @Override
    @Transactional
    public void addLord(Lord lord) {
        lordsDAO.addLord(lord);
    }

    @Override
    @Transactional
    public void addPlanet(Planet planet) {
        planetsDAO.addPlanet(planet);
    }

    @Override
    @Transactional
    public void addLordPlanet(Planet planet) {
      planetsDAO.addLordPlanet(planet);
    }

    @Override
    @Transactional
    public List<Lord> getAllLordsOfUnemployment() {
        return lordsDAO.getAllLordsOfUnemployment();
    }

    @Override
    @Transactional
    public void deletePlanet(int id) {
        planetsDAO.deletePlanet(id);
    }

    @Override
    public Planet getPlanet(int id) {
        return planetsDAO.getPlanet(id);
    }


}
