package com.company;

import java.time.LocalDate;

public class Medie extends Nota{
    public String teza_profil1;
    public String teza_profil2;
    public String teza_alegere;
    public int nota_teza_profil1;
    public int nota_teza_profil2;
    public int nota_teza_alegere;

    public Medie(int val_nota, int id_materie, LocalDate data_nota, int id_elev, String teza_profil1, String teza_profil2, String teza_alegere, int nota_teza_profil1, int nota_teza_profil2, int nota_teza_alegere) {
        super(val_nota, id_materie, data_nota, id_elev);
        this.teza_profil1 = teza_profil1;
        this.teza_profil2 = teza_profil2;
        this.teza_alegere = teza_alegere;
        this.nota_teza_profil1 = nota_teza_profil1;
        this.nota_teza_profil2 = nota_teza_profil2;
        this.nota_teza_alegere = nota_teza_alegere;
    }

    public String getTeza_profil1() {
        return teza_profil1;
    }

    public void setTeza_profil1(String teza_profil1) {
        this.teza_profil1 = teza_profil1;
    }

    public String getTeza_profil2() {
        return teza_profil2;
    }

    public void setTeza_profil2(String teza_profil2) {
        this.teza_profil2 = teza_profil2;
    }

    public String getTeza_alegere() {
        return teza_alegere;
    }

    public void setTeza_alegere(String teza_alegere) {
        this.teza_alegere = teza_alegere;
    }

    public int getNota_teza_profil1() {
        return nota_teza_profil1;
    }

    public void setNota_teza_profil1(int nota_teza_profil1) {
        this.nota_teza_profil1 = nota_teza_profil1;
    }

    public int getNota_teza_profil2() {
        return nota_teza_profil2;
    }

    public void setNota_teza_profil2(int nota_teza_profil2) {
        this.nota_teza_profil2 = nota_teza_profil2;
    }

    public int getNota_teza_alegere() {
        return nota_teza_alegere;
    }

    public void setNota_teza_alegere(int nota_teza_alegere) {
        this.nota_teza_alegere = nota_teza_alegere;
    }

    @Override
    public String toString() {
        return "Medie{" +
                "teza_profil1='" + teza_profil1 + '\'' +
                ", teza_profil2='" + teza_profil2 + '\'' +
                ", teza_alegere='" + teza_alegere + '\'' +
                ", nota_teza_profil1=" + nota_teza_profil1 +
                ", nota_teza_profil2=" + nota_teza_profil2 +
                ", nota_teza_alegere=" + nota_teza_alegere +
                ", nota_id=" + nota_id +
                ", val_nota=" + val_nota +
                ", id_materie=" + id_materie +
                ", data_nota=" + data_nota +
                ", id_elev=" + id_elev +
                '}';
    }
}
