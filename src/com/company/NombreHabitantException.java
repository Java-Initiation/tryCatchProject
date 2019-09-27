package com.company;

public class NombreHabitantException extends Exception {

    public NombreHabitantException(){
        System.out.println(
                "Impossible d'instancier une classe Ville " +
                        "avec un nombre d'habitants négatif !");
    }

}
