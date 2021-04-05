package com.sulavko.lords_and_planets.entity;


import javax.persistence.*;

@Entity
@Table(name = "lords")
public class Lord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name_lord")
    private String nameLord;
    @Column(name = "age_lord")
    private int ageLord;

    public Lord() {
    }

    public Lord(String nameLord, int ageLord) {

        this.nameLord = nameLord;
        this.ageLord = ageLord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLord() {
        return nameLord;
    }

    public void setNameLord(String nameLord) {
        this.nameLord = nameLord;
    }

    public int getAgeLord() {
        return ageLord;
    }

    public void setAgeLord(int ageLord) {
        this.ageLord = ageLord;
    }
}
