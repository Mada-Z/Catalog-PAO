package com.company;

import java.time.LocalDate;

public class Nota {
    protected int nota_id;
    public static int id=0;
    protected int val_nota;
    protected int id_materie;
    protected LocalDate data_nota;
    protected int id_elev;

    public Nota(int val_nota, int id_materie, LocalDate data_nota, int id_elev) {
        this.nota_id = ++id;
        this.val_nota = val_nota;
        this.id_materie = id_materie;
        this.data_nota = data_nota;
        this.id_elev = id_elev;
    }

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public int getVal_nota() {
        return val_nota;
    }

    public void setVal_nota(int val_nota) {
        this.val_nota = val_nota;
    }

    public int getId_materie() {
        return id_materie;
    }

    public void setId_materie(int id_materie) {
        this.id_materie = id_materie;
    }

    public LocalDate getData_nota() {
        return data_nota;
    }

    public void setData_nota(LocalDate data_nota) {
        this.data_nota = data_nota;
    }

    public int getId_elev() {
        return id_elev;
    }

    public void setId_elev(int id_elev) {
        this.id_elev = id_elev;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota_id=" + nota_id +
                ", val_nota=" + val_nota +
                ", id_materie=" + id_materie +
                ", data_nota=" + data_nota +
                ", id_elev=" + id_elev +
                '}';
    }
}
