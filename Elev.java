package com.company;

import java.util.ArrayList;

public class Elev {
    private int nr_matricol;
    public static int nr = 1000;
    private int nr_catalog;
    public int id_clasa;
    public String nume_elev;
    public String prenume_elev;
    private String CNP_elev;
    private String adresa_elev;

    public Elev(int nr_catalog, int id_clasa, String nume_elev, String prenume_elev, String CNP_elev, String adresa_elev) {
        this.nr_matricol = ++nr;
        this.nr_catalog = nr_catalog;
        this.id_clasa = id_clasa;
        this.nume_elev = nume_elev;
        this.prenume_elev = prenume_elev;
        this.CNP_elev = CNP_elev;
        this.adresa_elev = adresa_elev;
    }

    public int getNr_matricol() {
        return nr_matricol;
    }

    public void setNr_matricol(int nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    public int getNr_catalog() {
        return nr_catalog;
    }

    public void setNr_catalog(int nr_catalog) {
        this.nr_catalog = nr_catalog;
    }

    public int getId_clasa() {
        return id_clasa;
    }

    public void setId_clasa(int id_clasa) {
        this.id_clasa = id_clasa;
    }

    public String getNume_elev() {
        return nume_elev;
    }

    public void setNume_elev(String nume_elev) {
        this.nume_elev = nume_elev;
    }

    public String getPrenume_elev() {
        return prenume_elev;
    }

    public void setPrenume_elev(String prenume_elev) {
        this.prenume_elev = prenume_elev;
    }

    public String getCNP_elev() {
        return CNP_elev;
    }

    public void setCNP_elev(String CNP_elev) {
        this.CNP_elev = CNP_elev;
    }

    public String getAdresa_elev() {
        return adresa_elev;
    }

    public void setAdresa_elev(String adresa_elev) {
        this.adresa_elev = adresa_elev;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nr_matricol=" + nr_matricol +
                ", nr_catalog=" + nr_catalog +
                ", id_clasa=" + id_clasa +
                ", nume_elev='" + nume_elev + '\'' +
                ", prenume_elev='" + prenume_elev + '\'' +
                ", CNP_elev='" + CNP_elev + '\'' +
                ", adresa_elev='" + adresa_elev + '\'' +
                '}';
    }
}
