package com.company;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList inventaire = new ArrayList<>();
    private char sexe;


    public Player(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public ArrayList getInventaire() {
        return inventaire;
    }

    public char getSexe() {
        return sexe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventaire(String item) {

            this.inventaire.add(item);
        }


    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void rmItem(String item){
        this.inventaire.remove(item);
    }




}
