package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Citeste {
    public void citeste_materii(Serviciu serv){
        File f = new File("src/com/company/Materii.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            Materie materie = new Materie(Integer.valueOf(date[0]), date[1]);
            serv.getMaterii().add(materie);
        }
    }
    public void citeste_profesori(Serviciu serv){
        File f = new File("src/com/company/Profesori.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            ArrayList<Materie> materii= new ArrayList<>();
            for (int i = 8; i<date.length; i++){
                if (serv.gaseste_materie(Integer.valueOf(date[i]))!=null){
                    materii.add(serv.gaseste_materie(Integer.valueOf(date[i])));
                }
            }
            Profesor profesor = new Profesor(Integer.valueOf(date[0]), date[1], date[2], date[3], date[4], date[5], Integer.valueOf(date[6]), Boolean.valueOf(date[7]), materii);
            serv.getProfesori().add(profesor);
        }
    }
    public void citeste_clase(Serviciu serv){
        File f = new File("src/com/company/Clase.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            Clasa clasa = new Clasa(Integer.valueOf(date[0]), date[1],date[2], Integer.valueOf(date[3]));
            serv.getClase().add(clasa);
        }
    }
    public void citeste_elevi(Serviciu serv){
        File f = new File("src/com/company/Elevi.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            Elev elev = new Elev(Integer.valueOf(date[0]), Integer.valueOf(date[1]), Integer.valueOf(date[2]), date[3], date[4], date[5], date[6]);
            serv.getElevi().add(elev);
        }
    }
    public void citeste_note(Serviciu serv){
        File f = new File("src/com/company/Note.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            Nota nota = new Nota(Integer.valueOf(date[0]),Integer.valueOf(date[1]), Integer.valueOf(date[2]), LocalDate.parse(date[3]),Integer.valueOf(date[4]));
            serv.getNote().add(nota);
        }
    }
    public void citeste_absente(Serviciu serv){
        File f = new File("src/com/company/Absente.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            Absenta absenta = new Absenta(Integer.valueOf(date[0]),LocalDate.parse(date[1]),Integer.valueOf(date[2]),Integer.valueOf(date[3]));
            serv.getAbsente().add(absenta);
        }
    }
    public void citeste_parinti_tutori(Serviciu serv){
        File f = new File("src/com/company/ParintiSauTutori.csv");
        Scanner r = null;
        try{
            r = new Scanner(f);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (r.hasNextLine()){
            String data = r.nextLine();
            String[] date = data.split(",");
            ParinteSauTutore par_tut = new ParinteSauTutore(Integer.valueOf(date[0]), Integer.valueOf(date[1]), date[2],date[3],date[4],date[5],date[6],date[7]);
            serv.getPar_tut().add(par_tut);
        }
    }
}
