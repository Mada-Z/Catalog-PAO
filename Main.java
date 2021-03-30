package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Serviciu serv = new Serviciu();
	serv.adauga_materie("Matematica");
	ArrayList<Clasa> clase = serv.getClase();
	ArrayList<Profesor> profesori = serv.getProfesori();
	ArrayList<Materie> materii = serv.getMaterii();
	ArrayList<Nota> note = serv.getNote();
	ArrayList<Absenta> absente = serv.getAbsente();
	ArrayList<Elev> elevi = serv.getElevi();
	ArrayList<ParinteSauTutore> par_tut = serv.getPar_tut();

	serv.adauga_materie("Limba si Literatura Romana");
	serv.adauga_materie("Informatica");
	serv.adauga_materie("Limba Latina");



	serv.adauga_profesor("Popescu", "Ionel", "0712345678", "Str. Luminii, nr.70", "Buzau", 2300, 1, 1, true);
	serv.adauga_profesor("Ionescu", "Maricica","0723456789", "Str. Plopilor, nr. 85", "Bajani", 2500, 2, 2, true);

	serv.adauga_clasa("a XII-a C", "2015-2019", 1);
	serv.adauga_clasa("a X-a I", "2018-2022", 2);

	serv.adauga_elev(1, 1, "Avram", "Nicu", "5000621345678", "Bd. Libertatii, bl.75, scara b, et.7, ap. 109");
	serv.adauga_elev(2,1,"Bercu", "Dana", "6000215321123", "Str. Crizantemelor, nr. 17");
	serv.adauga_elev(1, 2, "Andrei", "Ioana", "6031212456789", "Str. Icoanei, nr. 25");
	serv.adauga_elev(2,2, "Banica", "Marcel", "5031029765432", "Str. Victoriei, bl. 45B, ap. 29, et. 4");

	serv.adauga_nota(7,4, 1003);
	serv.adauga_nota(10,1,1001);

	serv.adauga_absenta(1002, 3);
	serv.adauga_absenta(1004, 2);

	serv.adauga_parinte_tutore(1001, "Avram", "Marian", "0753624516", "Bd. Libertatii, bl.75, scara b, et.7, ap. 109", "superioare", "XZ123456");
	serv.adauga_parinte_tutore(1001, "Avram", "Clementina", "0753627861", "Bd. Libertatii, bl.75, scara b, et.7, ap. 109", "postliceale", "XZ123456");

		System.out.println();
		System.out.println("Clase: ");
		for(Clasa cls : clase){
			System.out.println(cls);
		}

		System.out.println();
		System.out.println("Profesori: ");
		for(Profesor prof : profesori){
			System.out.println(prof);
		}
		serv.sort(materii);
		System.out.println();
		System.out.println("Materii: ");
		for(Materie mat : materii){
			System.out.println(mat);
		}

		System.out.println();
		System.out.println("Elevi: ");
		for(Elev el : elevi){
			System.out.println(el);
		}

		System.out.println();
		System.out.println("Note: ");
		for (Nota nota : note){
			System.out.println(nota);
		}

		System.out.println();
		System.out.println("Absente: ");
		for(Absenta abs : absente){
			System.out.println(abs);
		}

		System.out.println();
		System.out.println("Parinti/Tutori: ");
		for(ParinteSauTutore pt : par_tut){
			System.out.println(pt);
		}




    }
}
