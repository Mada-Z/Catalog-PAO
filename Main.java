package com.company;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
    	DBConnection dbConnection = new DBConnection();
		Serviciu serv = new Serviciu();
	ArrayList<Clasa> clase = serv.getClase();
	ArrayList<Profesor> profesori = new ArrayList<>();
	ArrayList<Materie> materii = serv.getMaterii();
	ArrayList<Nota> note = serv.getNote();
	ArrayList<Absenta> absente = serv.getAbsente();
	ArrayList<Elev> elevi = serv.getElevi();
	ArrayList<ParinteSauTutore> par_tut = serv.getParinti();

//serv.adauga_materie("Limba si Literatura Romana");
//serv.adauga_scoala("Scoala Gimnaziala Nr. 11", "0238721676", "0238722568", "Str. Chiristigii, nr. 5, 120040, Buzau, jud. Buzau");
//serv.adauga_materie("Informatica");
//serv.adauga_materie("Limba Latina");
//serv.adauga_materie("Matematica");
//
//
//
//serv.adauga_profesor("Popescu", "Ionel", "0712345678", "Str. Luminii nr.70", "Buzau", 2300, true);
//serv.adauga_profesor("Ionescu", "Maricica","0723456789", "Str. Plopilor nr. 85", "Bajani", 2500, true);

//serv.materii_predate(5,3);
//serv.materii_predate(5, 1);
//serv.materii_predate(2,2);
//serv.materii_predate(2,4);

//	serv.adauga_clasa("a XII-a C", "2015-2019", 1);
//	serv.adauga_clasa("a X-a I", "2018-2022", 2);

//	serv.adauga_elev(1, 4, "Avram", "Nicu", "5000621345678", "Bd. Libertatii bl.75 scara b et.7 ap. 109");
//	serv.adauga_elev(2,4,"Bercu", "Dana", "6000215321123", "Str. Crizantemelor nr. 17");
//	serv.adauga_elev(1, 2, "Andrei", "Ioana", "6031212456789", "Str. Icoanei nr. 25");
//	serv.adauga_elev(2,2, "Banica", "Marcel", "5031029765432", "Str. Victoriei bl. 45B ap. 29 et. 4");

	serv.adauga_nota(7,4, 1024);
	serv.adauga_nota(10,1,1025);

//		try {
//			System.out.println(dbConnection.getScoli());
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}
//		try {
//			System.out.println(dbConnection.getProfesori());
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}
//		try {
//			profesori = dbConnection.getProfesori();
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}
//		try {
//			dbConnection.deleteProfesor(profesori.get(0));
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}
		dbConnection.updateAdresaScoala(1, "Strada Pietroasele, Nr. 15, Buzau");
	}


}



