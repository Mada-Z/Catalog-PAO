package com.company;

import java.util.Date;

public class Scoala {
    private int id_scoala;
    public static int id=0;
    public String nume_scoala;
    public String telefon;
    public String fax;
    public String adresa;

    public Scoala(String nume_scoala, String telefon, String fax, String adresa) {
        this.id_scoala = ++id;
        this.nume_scoala = nume_scoala;
        this.telefon = telefon;
        this.fax = fax;
        this.adresa = adresa;
    }

    public int getId_scoala() {
        return id_scoala;
    }

    public void setId_scoala(int id_scoala) {
        this.id_scoala = id_scoala;
    }

    public String getNume_scoala() {
        return nume_scoala;
    }

    public void setNume_scoala(String nume_scoala) {
        this.nume_scoala = nume_scoala;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Scoala{" +
                "id_scoala=" + id_scoala +
                ", nume_scoala='" + nume_scoala + '\'' +
                ", telefon='" + telefon + '\'' +
                ", fax='" + fax + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
