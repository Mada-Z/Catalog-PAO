package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Serviciu {
    DBConnection dbConnection = new DBConnection();
    Connection connection = dbConnection.DBConnection();
 ArrayList<Clasa> clase = new ArrayList<>();
 ArrayList<Profesor> profesori = new ArrayList<>();
 ArrayList<Materie> materii = new ArrayList<>();
 ArrayList<Nota> note = new ArrayList<>();
 ArrayList<Absenta> absente = new ArrayList<>();
 ArrayList<Elev> elevi = new ArrayList<>();
 ArrayList<ParinteSauTutore> parinti = new ArrayList<>();
 ArrayList<Scoala> scoli = new ArrayList<>();

    public ArrayList<Scoala> getScoli() throws SQLException {
        return dbConnection.getScoli();
    }

    public void setScoli(ArrayList<Scoala> scoli){
        this.scoli = scoli;
    }

    public ArrayList<Clasa> getClase() throws SQLException {
        return dbConnection.getClase();
    }

    public void setClase(ArrayList<Clasa> clase) {
        this.clase = clase;
    }

    public ArrayList<Profesor> getProfesori() throws SQLException {
        return dbConnection.getProfesori();
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }

    public ArrayList<Materie> getMaterii() throws SQLException {
        return dbConnection.getMaterii();
    }

    public void setMaterii(ArrayList<Materie> materii) {
        this.materii = materii;
    }

    public ArrayList<Nota> getNote() throws SQLException {
        return dbConnection.getNote();
    }

    public void setNote(ArrayList<Nota> note) {
        this.note = note;
    }

    public ArrayList<Absenta> getAbsente() {
        return absente;
    }

    public void setAbsente(ArrayList<Absenta> absente) {
        this.absente = absente;
    }

    public ArrayList<Elev> getElevi() throws SQLException {
        return dbConnection.getElevi();
    }

    public void setElevi(ArrayList<Elev> elevi) {
        this.elevi = elevi;
    }

    public ArrayList<ParinteSauTutore> getParinti() throws SQLException {
        return dbConnection.getParinti();
    }

    public void setPar_tut(ArrayList<ParinteSauTutore> par_tut) {
        this.parinti = parinti;
    }
    public Clasa gaseste_clasa(int id) {
        for (Clasa cls : clase) {
            if (cls.getId_clasa() == id)
                return cls;
        }
        return null;
    }
    public  ParinteSauTutore gaseste_parinte(int id) {
        for(ParinteSauTutore par : parinti){
            if(par.getId_parinte() == id)
                return par;
        }
        return null;
    }
    public Profesor gaseste_profesor ( int id){
        for (Profesor prof : profesori) {
            if (prof.getId_prof() == id)
                    return prof;
        }
        return null;
        }
    public Profesor gaseste_diriginte(int id){
        for(Profesor prof : profesori){
            if(prof.isDiriginte())
                return prof;
        }
        return null;
    }

        public void adauga_clasa(String nume_clasa, String generatie, int id_diriginte){
        Clasa clasa = new Clasa(nume_clasa, generatie, id_diriginte);
        dbConnection.adauga_clasa(clasa);
        }
        public Materie gaseste_materie(int id){
        for(Materie materie : materii){
            if(materie.getId_materie()==id)
                return materie;
        }
        return null;
        }
        public Scoala gaseste_scoala(int id){
        for(Scoala scoala : scoli){
            if(scoala.getId_scoala()==id)
                return scoala;
        }
        return null;
        }
        public void adauga_materie(String nume){
        Materie materie = new Materie(nume);
        dbConnection.adauga_materie(materie);
        }
        public void materii_predate(int id_profesor, int id_materie){
        dbConnection.materii_predate(id_profesor, id_materie);
        }
        public void adauga_scoala(String nume, String telefon, String fax, String adresa){
        Scoala scoala = new Scoala(nume, telefon, fax, adresa);
        dbConnection.adauga_scoala(scoala);
        }
        public void adauga_profesor(String nume, String prenume, String telefon, String adresa, String localitate, int salariu, boolean diriginte) {
        Profesor profesor = new Profesor(nume, prenume,telefon,adresa,localitate,salariu,diriginte);
        dbConnection.adauga_profesor(profesor);
        }
        public void adauga_nota(int val_nota, int id_materie, int id_elev){
         LocalDate data_nota = LocalDate.now();
         Nota nota = new Nota(val_nota, id_materie, data_nota, id_elev);
         dbConnection.adauga_nota(nota);

        }
        public Elev gaseste_elev(int id){
                for (Elev elev : elevi) {
                    if (elev.getNr_matricol() == id) {
                        return elev;
                    }
                }
                return null;

        }
        public Absenta gaseste_absenta(int id){
        for(Absenta absenta : absente){
            if (absenta.getId_absenta()==id){
                return absenta;
            }
        }
        return null;
        }
        public void adauga_absenta(int id_elev,int id_materie) throws MyException {
        if(gaseste_elev(id_elev)!=null && gaseste_materie(id_materie)!=null){
            LocalDate data_absenta = LocalDate.now();
            Absenta absenta = new Absenta(data_absenta, id_elev, id_materie);
            absente.add(absenta);
        }
        else {
            System.out.println("Materia sau elevul nu exista!");
            throw new MyException("Materia sau elevul nu exista!");
        }
        }
        public void adauga_elev(int nr_catalog, int id_clasa, String nume, String prenume, String CNP, String adresa){
        Elev elev = new Elev(nr_catalog,id_clasa,nume,prenume,CNP,adresa);
        dbConnection.adauga_elev(elev);
        }
        public void adauga_parinte(int id_elev, String nume, String prenume, String tel, String adresa, String studii, String serie_nr_CI) {
        ParinteSauTutore parinte = new ParinteSauTutore(id_elev,nume,prenume,tel,adresa,studii,serie_nr_CI);
        dbConnection.adauga_parinte(parinte);
        }
    public static void sort(ArrayList<Materie> list)
    {

        list.sort((o1, o2)
                -> o1.getNume_materie().compareTo(
                o2.getNume_materie()));
    }


    }