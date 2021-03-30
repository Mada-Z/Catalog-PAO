package com.company;

import java.util.ArrayList;

public class Materie {
    private int id_materie;
    public static int id = 0;
    public String nume_materie;

    public Materie(String nume_materie) {
        this.id_materie = ++id;
        this.nume_materie = nume_materie;
    }

    public int getId_materie() {
        return id_materie;
    }

    public void setId_materie(int id_materie) {
        this.id_materie = id_materie;
    }

    public String getNume_materie() {
        return nume_materie;
    }

    public void setNume_materie(String nume_materie) {
        this.nume_materie = nume_materie;
    }

    @Override
    public String toString() {
        return "Materie{" +
                "id_materie=" + id_materie +
                ", nume_materie='" + nume_materie + '\'' +
                '}';
    }
}
