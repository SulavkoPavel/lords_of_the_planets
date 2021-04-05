package com.sulavko.lords_and_planets.dao;

import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;

import java.util.List;

public interface LordsDAO {

    public List<Lord> getAllLords();

    public void addLord(Lord lords);

    public List<Lord> getAllLordsOfUnemployment();



}
