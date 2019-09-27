package com.company;

public class Ville {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) throws NombreHabitantException {
        this.nom = nom;
        if (nbHabitants < 0)
            throw new NombreHabitantException();
        else
            this.nbHabitants = nbHabitants;
    }
}
