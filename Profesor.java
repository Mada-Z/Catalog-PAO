package com.company;

import java.util.ArrayList;

public class Profesor {
    protected int id_prof;
    public static int id = 0;
    public String nume;
    public String prenume;
    public String telefon;
    public String adresa;
    public String localitate;
    private int salariu;
    private boolean diriginte;
    public ArrayList<Materie> materii_predate;

    public Profesor(String nume, String prenume, String telefon, String adresa, String localitate, int salariu, boolean diriginte, ArrayList<Materie> materii_predate) {
        this.id_prof = ++id;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.localitate = localitate;
        this.salariu = salariu;
        this.diriginte = diriginte;
        materii_predate = new ArrayList<>();
        this.materii_predate = materii_predate;
    }
    public Profesor(String nume, String prenume, String telefon, String adresa, String localitate, int salariu, boolean diriginte) {
        this.id_prof = ++id;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.localitate = localitate;
        this.salariu = salariu;
        this.diriginte = diriginte;
    }

    public Profesor(int id_prof, String nume, String prenume, String telefon, String adresa, String localitate, int salariu, boolean diriginte, ArrayList<Materie> materii_predate) {
        this.id_prof = id_prof;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.localitate = localitate;
        this.salariu = salariu;
        this.diriginte = diriginte;
        this.materii_predate = new ArrayList<>();
        this.materii_predate = materii_predate;
        ++id;
    }

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public boolean isDiriginte() {
        return diriginte;
    }

    public void setDiriginte(boolean diriginte) {
        this.diriginte = diriginte;
    }

    public ArrayList<Materie> getMaterii_predate() {
        return materii_predate;
    }

    public void setMaterii_predate(ArrayList<Materie> materii_predate) {
        this.materii_predate = materii_predate;
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "id_prof=" + id_prof +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adresa='" + adresa + '\'' +
                ", localitate='" + localitate + '\'' +
                ", salariu=" + salariu +
                ", diriginte=" + diriginte +
                ", materii_predate=" + materii_predate +
                '}';
    }
}
