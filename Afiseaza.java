package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Afiseaza {
    public void afisare_materie(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Materii.csv");
            for (Materie materie: serv.getMaterii()){
                String mat = materie.getId_materie()+"," + materie.getNume_materie();
                w.write(mat);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_profesor(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Profesori.csv");
            for (Profesor profesor: serv.getProfesori()){
                String prof = profesor.getId_prof()+","+profesor.getNume()+","+profesor.getPrenume()+","+profesor.getTelefon()+","+profesor.getAdresa()+","+profesor.getLocalitate()+","+profesor.getSalariu()+","+profesor.isDiriginte();
                for (Materie materie:profesor.getMaterii_predate()){
                    prof = prof +","+materie.getId_materie();
                }
                w.write(prof);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_clasa(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Clase.csv");
            for (Clasa clasa: serv.getClase()){
                String cls = clasa.getId_clasa()+","+clasa.getNume_clasa()+","+clasa.getGeneratie()+","+clasa.getId_diriginte();
                w.write(cls);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_elev(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Elevi.csv");
            for (Elev elev: serv.getElevi()){
                String el = elev.getNr_matricol()+","+elev.getNr_catalog()+","+ elev.getId_clasa()+","+elev.getNume_elev()+","+elev.getPrenume_elev()+","+elev.getCNP_elev()+","+elev.getAdresa_elev();
                w.write(el);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_nota(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Note.csv");
            for (Nota nota: serv.getNote()){
                String n = nota.getNota_id()+","+nota.getVal_nota()+","+nota.getId_materie()+","+nota.getData_nota()+","+nota.getId_elev();
                w.write(n);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_absenta(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/Absente.csv");
            for (Absenta absenta: serv.getAbsente()){
                String abs = absenta.getId_absenta()+","+absenta.getData_absenta()+","+absenta.getId_elev()+","+ absenta.getAbsenta_la();
                w.write(abs);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void afisare_par_tut(Serviciu serv){
        try{
            FileWriter w = new FileWriter("src/com/company/ParintiSauTutori.csv");
            for (ParinteSauTutore pt: serv.getPar_tut()){
                String par_tut = pt.getId_parinte()+","+pt.getId_elev()+","+pt.getNume_parinte()+","+pt.getPrenume_parinte()+","+pt.getTel_parinte()+","+pt.getAdresa_parinte()+","+pt.getNivel_studii()+","+pt.getSerie_nr_CI();
                w.write(par_tut);
                w.write('\n');

            }
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
