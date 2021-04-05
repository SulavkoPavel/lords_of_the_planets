package com.sulavko.lords_and_planets.controller;

import com.sulavko.lords_and_planets.entity.Lord;
import com.sulavko.lords_and_planets.entity.Planet;
import com.sulavko.lords_and_planets.service.DAOServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    DAOServiceImpl daoService;

    @PostMapping("addNewLord")
    public Lord addNewLord(@RequestBody Lord lord){
        daoService.addLord(lord);

        return lord;
    }

    @PostMapping("addNewPlanet")
    public Planet addNewPlanet(@RequestBody Planet planet){
        daoService.addPlanet(planet);

        return planet;
    }

    @PutMapping("addLordPlanet")
    public Planet addLordPlanet(@RequestBody Planet planet){
        daoService.addLordPlanet(planet);


        return planet;
    }

    @DeleteMapping("deletePlanet/{id}")
    public String  deletePlanet(@PathVariable int id){
        Planet planet = daoService.getPlanet(id);
        daoService.deletePlanet(id);

        return "Planet " + planet.getNamePlanet() + " was deleted";
    }

    @GetMapping("allLordsOfUnemployment")
    public List<Lord> allLordsOfUnemployment(){
        List<Lord> allLordsOfUnemployment =
                daoService.getAllLordsOfUnemployment();

        return allLordsOfUnemployment;

    }

    @GetMapping("topLords")
    public List<Lord> showAllLords(){

        List<Lord> allLords = daoService.getAllLords();

        return allLords;
    }
}
