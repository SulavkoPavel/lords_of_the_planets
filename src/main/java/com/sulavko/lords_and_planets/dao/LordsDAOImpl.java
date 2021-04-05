package com.sulavko.lords_and_planets.dao;

import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.*;

@Repository
public class LordsDAOImpl implements LordsDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Lord> getAllLords() {
        Session session = entityManager.unwrap(Session.class);

       Query<Lord> query = session.createQuery("from Lord order by ageLord asc  ", Lord.class).setMaxResults(10);
       List<Lord> allLords = query.getResultList();


        return allLords;
    }

    @Override
    public void addLord(Lord lords) {
       Session session = entityManager.unwrap(Session.class);

       session.saveOrUpdate(lords);
    }

    @Override
    public List<Lord> getAllLordsOfUnemployment() {
        Session session = entityManager.unwrap(Session.class);

        Query<Lord> query1 = session.createQuery("from Lord", Lord.class);
        List<Lord> allLords = query1.getResultList();

        Query<Planet> query2 = session.createQuery("from  Planet", Planet.class);
        List<Planet> allLPlanet = query2.getResultList();

        List<Lord> allLordsOfUnemployment = new ArrayList<>();


            for (int i = 0; i < allLPlanet.size(); i++)
               if(allLPlanet.get(i).getId()!=0){
                allLordsOfUnemployment.add(allLords.get((allLPlanet.get(i).getIdLord())-1));
             }
                  allLords.removeAll(allLordsOfUnemployment);

        return allLords;
    }
}
