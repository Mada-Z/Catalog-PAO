package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Serviciu {
 ArrayList<Clasa> clase = new ArrayList<>();
 ArrayList<Profesor> profesori = new ArrayList<>();
 ArrayList<Materie> materii = new ArrayList<>();
 ArrayList<Nota> note = new ArrayList<>();
 ArrayList<Absenta> absente = new ArrayList<>();
 ArrayList<Elev> elevi = new ArrayList<>();
 ArrayList<ParinteSauTutore> par_tut = new ArrayList<>();

    public ArrayList<Clasa> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Clasa> clase) {
        this.clase = clase;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }

    public ArrayList<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(ArrayList<Materie> materii) {
        this.materii = materii;
    }

    public ArrayList<Nota> getNote() {
        return note;
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

    public ArrayList<Elev> getElevi() {
        return elevi;
    }

    public void setElevi(ArrayList<Elev> elevi) {
        this.elevi = elevi;
    }

    public ArrayList<ParinteSauTutore> getPar_tut() {
        return par_tut;
    }

    public void setPar_tut(ArrayList<ParinteSauTutore> par_tut) {
        this.par_tut = par_tut;
    }
    public Clasa gaseste_clasa(int id) {
        for (Clasa cls : clase) {
            if (cls.getId_clasa() == id)
                return cls;
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
        public void adauga_profesor(String nume, String prenume, String telefon, String adresa, String localitate, int salariu, int id_materie, int id_clasa, boolean diriginte){
            Profesor profesor = new Profesor(nume, prenume, telefon, adresa, localitate, salariu, diriginte, null);
            profesori.add(profesor);
            Clasa clasa = gaseste_clasa(id_clasa);


    }
        public void adauga_clasa(String nume_clasa, String generatie, int id_diriginte){
        if(gaseste_profesor(id_diriginte)!= null){
            if(gaseste_diriginte(id_diriginte) != null){
                Clasa clasa = new Clasa(nume_clasa, generatie, id_diriginte);
                clase.add(clasa);
            }
            else{
                System.out.println("Profesorul nu este diriginte!");
            }
        }
        else{
            System.out.println("Profesorul nu exista!");
        }
        }
        public Materie gaseste_materie(int id){
        for(Materie materie : materii){
            if(materie.getId_materie()==id)
                return materie;
        }
        return null;
        }
        public void adauga_materie(String nume){
        Materie materie = new Materie(nume);
        materii.add(materie);
        }
        public void adauga_profesor(String nume, String prenume, String telefon, String adresa, String localitate, int salariu, boolean diriginte,int id_materie) {

            if (gaseste_materie(id_materie) != null) {
                Profesor profesor = new Profesor(nume, prenume, telefon, adresa, localitate, salariu, diriginte, null);
                Materie materie = gaseste_materie(id_materie);
                profesor.materii_predate.add(materie);
            } else {
                System.out.println("Nu exista materia!");

            }
        }
        public void adauga_nota(int val_nota, int id_materie, int id_elev) {
            if (gaseste_materie(id_materie) != null && gaseste_elev(id_elev)!=null) {
                LocalDate data_nota = LocalDate.now();
                Nota nota = new Nota(val_nota, id_materie, data_nota, id_elev);
                note.add(nota);
            } else {
                System.out.println("Materia nu exista sau elevul nu exista!");
            }
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
        public void adauga_absenta(int id_elev,int id_materie){
        if(gaseste_elev(id_elev)!=null && gaseste_materie(id_materie)!=null){
            LocalDate data_absenta = LocalDate.now();
            Absenta absenta = new Absenta(data_absenta, id_elev, id_materie);
            absente.add(absenta);
        }
        else {
            System.out.println("Materia sau elevul nu exista!");
        }
        }
        public void adauga_elev(int nr_catalog, int id_clasa, String nume, String prenume, String CNP, String adresa) {
            if (gaseste_clasa(id_clasa) != null) {
                if (CNP.length() != 13) {
                    System.out.println("CNP-ul nu este corect!");

                } else {
                    Elev elev = new Elev(nr_catalog, id_clasa, nume, prenume, CNP, adresa);
                    elevi.add(elev);
                }
            }
        }
        public void adauga_parinte_tutore(int id_elev, String nume, String prenume, String tel, String adresa, String studii, String serie_nr_CI) {
        if(gaseste_elev(id_elev)!=null){
            ParinteSauTutore parintesaututore = new ParinteSauTutore(id_elev,nume,prenume,tel,adresa,studii,serie_nr_CI);
            par_tut.add(parintesaututore);
        }
        else {
            System.out.println("Elevul nu exista!");
        }

        }


    }