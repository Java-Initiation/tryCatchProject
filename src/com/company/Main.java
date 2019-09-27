package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            Ville paris = new Ville("Paris", -4334);
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        }

    }
}
