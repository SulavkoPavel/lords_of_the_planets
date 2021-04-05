package com.sulavko.lords_and_planets.dao;


import com.sulavko.lords_and_planets.entity.Planet;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PlanetsDAOImpl implements PlanetsDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addPlanet(Planet planet) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(planet);
    }

    @Override
    public void addLordPlanet(Planet planet) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(planet);

    }

    @Override
    public void deletePlanet(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Planet> query = session.createQuery("delete from Planet "+
                "where id =:planetId");
        query.setParameter("planetId",id);
        query.executeUpdate();

    }

    @Override
    public Planet getPlanet(int id) {
        Session session = entityManager.unwrap(Session.class);
        Planet planet = session.get(Planet.class,id);

        return planet;
    }

}
