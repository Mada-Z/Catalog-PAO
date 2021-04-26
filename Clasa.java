package com.company;

public class Clasa {
    protected int id_clasa;
    public static int id=0;
    public String nume_clasa;
    public String generatie;
    public int id_diriginte;

    public Clasa(String nume_clasa, String generatie, int id_diriginte) {
        this.id_clasa = ++id;
        this.nume_clasa = nume_clasa;
        this.generatie = generatie;
        this.id_diriginte = id_diriginte;
    }

    public Clasa(int id_clasa, String nume_clasa, String generatie, int id_diriginte) {
        this.id_clasa = id_clasa;
        this.nume_clasa = nume_clasa;
        this.generatie = generatie;
        this.id_diriginte = id_diriginte;
        ++id;
    }

    public int getId_clasa() {
        return id_clasa;
    }

    public void setId_clasa(int id_clasa) {
        this.id_clasa = id_clasa;
    }

    public String getNume_clasa() {
        return nume_clasa;
    }

    public void setNume_clasa(String nume_clasa) {
        this.nume_clasa = nume_clasa;
    }

    public String getGeneratie() {
        return generatie;
    }

    public void setGeneratie(String generatie) {
        this.generatie = generatie;
    }

    public int getId_diriginte() {
        return id_diriginte;
    }

    public void setId_diriginte(int id_diriginte) {
        this.id_diriginte = id_diriginte;
    }

    @Override
    public String toString() {
        return "Clasa{" +
                "id_clasa=" + id_clasa +
                ", nume_clasa='" + nume_clasa + '\'' +
                ", generatie='" + generatie + '\'' +
                ", id_diriginte=" + id_diriginte +
                '}';
    }
}
