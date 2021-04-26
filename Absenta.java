package com.company;

import java.time.LocalDate;

import java.util.ArrayList;

public class Absenta {
    private int id_absenta;
    public static int id=0;
    public LocalDate data_absenta;
    private int id_elev;
    public int absenta_la;

    public Absenta(LocalDate data_absenta, int id_elev, int absenta_la) {
        this.id_absenta = ++id;
        this.data_absenta = data_absenta;
        this.id_elev = id_elev;
        this.absenta_la = absenta_la;
    }

    public Absenta(int id_absenta, LocalDate data_absenta, int id_elev, int absenta_la) {
        this.id_absenta = id_absenta;
        this.data_absenta = data_absenta;
        this.id_elev = id_elev;
        this.absenta_la = absenta_la;
        ++id;
    }

    public int getId_absenta() {
        return id_absenta;
    }

    public void setId_absenta(int id_absenta) {
        this.id_absenta = id_absenta;
    }

    public LocalDate getData_absenta() {
        return data_absenta;
    }

    public void setData_absenta(LocalDate data_absenta) {
        this.data_absenta = data_absenta;
    }

    public int getId_elev() {
        return id_elev;
    }

    public void setId_elev(int id_elev) {
        this.id_elev = id_elev;
    }

    public int getAbsenta_la() {
        return absenta_la;
    }

    public void setAbsenta_la(int absenta_la) {
        this.absenta_la = absenta_la;
    }

    @Override
    public String toString() {
        return "Absenta{" +
                "id_absenta=" + id_absenta +
                ", data_absenta=" + data_absenta +
                ", id_elev=" + id_elev +
                ", absenta_la=" + absenta_la +
                '}';
    }
}
