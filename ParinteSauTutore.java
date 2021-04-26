package com.company;

public class ParinteSauTutore {
    private int id_parinte;
    public static int id=0;
    private int id_elev;
    public String nume_parinte;
    public String prenume_parinte;
    public String tel_parinte;
    private String adresa_parinte;
    private String nivel_studii;
    private String serie_nr_CI;

    public ParinteSauTutore(int id_elev, String nume_parinte, String prenume_parinte, String tel_parinte, String adresa_parinte, String nivel_studii, String serie_nr_CI) {
        this.id_parinte = ++id;
        this.id_elev = id_elev;
        this.nume_parinte = nume_parinte;
        this.prenume_parinte = prenume_parinte;
        this.tel_parinte = tel_parinte;
        this.adresa_parinte = adresa_parinte;
        this.nivel_studii = nivel_studii;
        this.serie_nr_CI = serie_nr_CI;
    }

    public ParinteSauTutore(int id_parinte, int id_elev, String nume_parinte, String prenume_parinte, String tel_parinte, String adresa_parinte, String nivel_studii, String serie_nr_CI) {
        this.id_parinte = id_parinte;
        this.id_elev = id_elev;
        this.nume_parinte = nume_parinte;
        this.prenume_parinte = prenume_parinte;
        this.tel_parinte = tel_parinte;
        this.adresa_parinte = adresa_parinte;
        this.nivel_studii = nivel_studii;
        this.serie_nr_CI = serie_nr_CI;
        ++id;
    }

    public int getId_parinte() {
        return id_parinte;
    }

    public void setId_parinte(int id_parinte) {
        this.id_parinte = id_parinte;
    }

    public int getId_elev() {
        return id_elev;
    }

    public void setId_elev(int id_elev) {
        this.id_elev = id_elev;
    }

    public String getNume_parinte() {
        return nume_parinte;
    }

    public void setNume_parinte(String nume_parinte) {
        this.nume_parinte = nume_parinte;
    }

    public String getPrenume_parinte() {
        return prenume_parinte;
    }

    public void setPrenume_parinte(String prenume_parinte) {
        this.prenume_parinte = prenume_parinte;
    }

    public String getTel_parinte() {
        return tel_parinte;
    }

    public void setTel_parinte(String tel_parinte) {
        this.tel_parinte = tel_parinte;
    }

    public String getAdresa_parinte() {
        return adresa_parinte;
    }

    public void setAdresa_parinte(String adresa_parinte) {
        this.adresa_parinte = adresa_parinte;
    }

    public String getNivel_studii() {
        return nivel_studii;
    }

    public void setNivel_studii(String nivel_studii) {
        this.nivel_studii = nivel_studii;
    }

    public String getSerie_nr_CI() {
        return serie_nr_CI;
    }

    public void setSerie_nr_CI(String serie_nr_CI) {
        this.serie_nr_CI = serie_nr_CI;
    }

    @Override
    public String toString() {
        return "ParinteSauTutore{" +
                "id_parinte=" + id_parinte +
                ", id_elev=" + id_elev +
                ", nume_parinte='" + nume_parinte + '\'' +
                ", prenume_parinte='" + prenume_parinte + '\'' +
                ", tel_parinte='" + tel_parinte + '\'' +
                ", adresa_parinte='" + adresa_parinte + '\'' +
                ", nivel_studii='" + nivel_studii + '\'' +
                ", serie_nr_CI='" + serie_nr_CI + '\'' +
                '}';
    }
}
