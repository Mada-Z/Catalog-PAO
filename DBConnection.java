package com.company;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {


    private static Connection connection;
    public Connection DBConnection(){

        if (connection != null) {
            return connection;
        }
        else {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog", "root", "Taekailina1.");
                return connection;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


            return null;

        }
    }

    public void adauga_materie (Materie materie) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO materie (nume) VALUES (?)");
            statement.setString(1, materie.getNume_materie());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void adauga_scoala (Scoala scoala) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO scoala (nume, telefon, fax, adresa) VALUES (?,?,?,?)");
            statement.setString(1, scoala.getNume_scoala());
            statement.setString(2, scoala.getTelefon());
            statement.setString(3, scoala.getFax());
            statement.setString(4, scoala.getAdresa());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void adauga_profesor (Profesor profesor) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO profesor (last_name, first_name, telefon, adresa, localitate, salariu, diriginte) VALUES (?,?,?,?,?,?,?)");
            statement.setString(1, profesor.getNume());
            statement.setString(2, profesor.getPrenume());
            statement.setString(3, profesor.getTelefon());
            statement.setString(4, profesor.getAdresa());
            statement.setString(5, profesor.getLocalitate());
            statement.setInt(6, profesor.getSalariu());
            statement.setBoolean(7, profesor.isDiriginte());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void materii_predate (int id_profesor, int id_materie) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO preda (id_profesor, id_materie) VALUES (?,?)");
            statement.setInt(1, id_profesor);
            statement.setInt(2, id_materie);
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void adauga_clasa (Clasa clasa) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO clasa (nume, generatie, id_diriginte) VALUES (?,?,?)");
            statement.setString(1, clasa.getNume_clasa());
            statement.setString(2, clasa.getGeneratie());
            statement.setInt(3, clasa.getId_diriginte());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void adauga_elev(Elev elev) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO elev (nr_catalog, id_clasa, last_name, first_name, cnp, adresa) VALUES (?,?,?,?,?,?)");
            statement.setInt(1, elev.getNr_catalog());
            statement.setInt(2, elev.getId_clasa());
            statement.setString(3, elev.getNume_elev());
            statement.setString(4, elev.getPrenume_elev());
            statement.setString(5, elev.getCNP_elev());
            statement.setString(6, elev.getAdresa_elev());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void adauga_parinte(ParinteSauTutore parinte) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO parinte (id_elev, nume, prenume, telefon, adresa, studii, serie_nr_ci) VALUES (?,?,?,?,?,?,?)");
            statement.setInt(1, parinte.getId_elev());
            statement.setString(2, parinte.getNume_parinte());
            statement.setString(3, parinte.getPrenume_parinte());
            statement.setString(4, parinte.getTel_parinte());
            statement.setString(5, parinte.getAdresa_parinte());
            statement.setString(6, parinte.getNivel_studii());
            statement.setString(7, parinte.getSerie_nr_CI());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void adauga_nota (Nota nota) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO nota (val_nota, data_nota, id_materie, id_elev) VALUES (?,?,?,?)");
            statement.setInt(1, nota.getVal_nota());
            statement.setDate(2, Date.valueOf(nota.getData_nota()));
            statement.setInt(3, nota.getId_materie());
            statement.setInt(4, nota.getId_elev());
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public ArrayList<Scoala> getScoli() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from scoala");
        ArrayList<Scoala> scoli = new ArrayList<>();
        while (resultSet.next()){
            Scoala scoala = new Scoala(resultSet.getString("nume"),resultSet.getString("telefon"), resultSet.getString("fax"), resultSet.getString("adresa"));
            scoli.add(scoala);
        }
        return scoli;
    }

    public ArrayList<Profesor> getProfesori() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from profesor");
        ArrayList<Profesor> profesori = new ArrayList<>();
        while (resultSet.next()){
            Profesor profesor = new Profesor(resultSet.getString("last_name"),resultSet.getString("first_name"), resultSet.getString("telefon"), resultSet.getString("adresa"), resultSet.getString("localitate"), resultSet.getInt("salariu"), resultSet.getBoolean("diriginte"));
            profesori.add(profesor);
        }
        return profesori;
    }
    public ArrayList<ParinteSauTutore> getParinti() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from parinte");
        ArrayList<ParinteSauTutore> parinti = new ArrayList<>();
        while (resultSet.next()){
            ParinteSauTutore parinte = new ParinteSauTutore(resultSet.getInt("id_elev"), resultSet.getString("nume"),resultSet.getString("prenume"), resultSet.getString("telefon"), resultSet.getString("adresa"), resultSet.getString("studii"), resultSet.getString("serie_nr_ci"));
            parinti.add(parinte);
        }
        return parinti;
    }
    public ArrayList<Nota> getNote() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from nota");
        ArrayList<Nota> note = new ArrayList<>();
        while (resultSet.next()){
            Nota nota = new Nota(resultSet.getInt("val_nota"),  resultSet.getInt("id_materie"), resultSet.getDate("data_nota").toLocalDate(), resultSet.getInt("id_elev"));
            note.add(nota);
        }
        return note;
    }
    public ArrayList<Materie> getMaterii() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from materie");
        ArrayList<Materie> materii = new ArrayList<>();
        while (resultSet.next()){
            Materie materie = new Materie(resultSet.getString("nume"));
            materii.add(materie);
        }
        return materii;
    }
    public ArrayList<Elev> getElevi() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from elev");
        ArrayList<Elev> elevi = new ArrayList<>();
        while (resultSet.next()){
            Elev elev = new Elev(resultSet.getInt("nr_catalog"), resultSet.getInt("id_clasa"), resultSet.getString("last_name"), resultSet.getString("first_name"), resultSet.getString("cnp"), resultSet.getString("adresa"));
            elevi.add(elev);
        }
        return elevi;
    }
    public ArrayList<Clasa> getClase() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from clasa");
        ArrayList<Clasa> clase = new ArrayList<>();
        while (resultSet.next()){
            Clasa clasa = new Clasa(resultSet.getString("nume"), resultSet.getString("generatie"), resultSet.getInt("id_diriginte"));
            clase.add(clasa);
        }
        return clase;
    }
    public ArrayList<Materie> getMateriiPredate(int id_profesor) throws SQLException {
        ArrayList<Materie> materii = new ArrayList<>();
        Serviciu serv = new Serviciu();
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.DBConnection();
        materii = getMaterii();
        ArrayList<Materie> materiiPredate = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from preda where id_profesor = " + id_profesor);
        while (resultSet.next()){
            for(Materie mat : materii){
                if(mat.getId_materie() == resultSet.getInt("id_materie")){
                    Materie materiePredata = serv.gaseste_materie(mat.getId_materie());
                    materiiPredate.add(materiePredata);
                }
            }
        }
        return materiiPredate;

    }

    public void deleteScoala(Scoala scoala) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from scoala where id_scoala = ?");
        preparedStatement.setInt(1, scoala.getId_scoala());
        preparedStatement.execute();
    }

    public void deleteProfesor(Profesor profesor) throws SQLException {
        PreparedStatement preparedStatement2 = connection.prepareStatement("delete from preda where id_profesor = ?");
        preparedStatement2.setInt(1, profesor.getId_prof());
        preparedStatement2.execute();

        PreparedStatement preparedStatement1 = connection.prepareStatement("delete from profesor where id_profesor = ?");
        preparedStatement1.setInt(1, profesor.getId_prof());
        preparedStatement1.execute();


    }

    public void deleteParinte(ParinteSauTutore parinte) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from profesor where id_parinte = ?");
        preparedStatement.setInt(1, parinte.getId_parinte());
        preparedStatement.execute();


    }

    public void deleteNota(Nota nota) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from nota where id_nota = ?");
        preparedStatement.setInt(1, nota.getNota_id());
        preparedStatement.execute();

    }

    public void deleteMaterie(Materie materie) throws SQLException {
        PreparedStatement preparedStatement2 = connection.prepareStatement("delete from preda where id_materie = ?");
        preparedStatement2.setInt(1, materie.getId_materie());
        preparedStatement2.execute();

        PreparedStatement preparedStatement1 = connection.prepareStatement("delete from materie where id_materie = ?");
        preparedStatement1.setInt(1, materie.getId_materie());
        preparedStatement1.execute();
    }

    public void deleteElev(Elev elev) throws SQLException {
        PreparedStatement preparedStatement2 = connection.prepareStatement("delete from nota where id_elev = ?");
        preparedStatement2.setInt(1, elev.getNr_matricol());
        preparedStatement2.execute();

        PreparedStatement preparedStatement1 = connection.prepareStatement("delete from parinte where id_elev = ?");
        preparedStatement1.setInt(1, elev.getNr_matricol());
        preparedStatement1.execute();

        PreparedStatement preparedStatement3 = connection.prepareStatement("delete from elev where nr_matricol = ?");
        preparedStatement3.setInt(1, elev.getNr_matricol());
        preparedStatement3.execute();
    }

    public void deleteClasa(Clasa clasa) throws SQLException {
        ArrayList<Elev> elevi = new ArrayList<>();
        elevi = getElevi();
        for(Elev elev:elevi){
            if (elev.getId_clasa() == clasa.getId_clasa()){
                deleteElev(elev);
            }
        }

        PreparedStatement preparedStatement1 = connection.prepareStatement("delete from clasa where id_clasa = ?");
        preparedStatement1.setInt(1, clasa.getId_clasa());
        preparedStatement1.execute();
    }

    public void updateNumeScoala(int id_scoala, String nume) throws SQLException {
        Serviciu serv = new Serviciu();
        Scoala scoala = serv.gaseste_scoala(id_scoala);
        PreparedStatement preparedStatement = connection.prepareStatement("update scoala set nume = ? where id_scoala = ?");
        preparedStatement.setString(1,nume);
        preparedStatement.setInt(2,id_scoala);
        preparedStatement.execute();

    }
    public void updateTelScoala(int id_scoala, String tel) throws SQLException {
        Serviciu serv = new Serviciu();
        Scoala scoala = serv.gaseste_scoala(id_scoala);
        PreparedStatement preparedStatement = connection.prepareStatement("update scoala set telefon = ? where id_scoala = ?");
        preparedStatement.setString(1,tel);
        preparedStatement.setInt(2,id_scoala);
        preparedStatement.execute();

    }
    public void updateFaxScoala(int id_scoala, String fax) throws SQLException {
        Serviciu serv = new Serviciu();
        Scoala scoala = serv.gaseste_scoala(id_scoala);
        PreparedStatement preparedStatement = connection.prepareStatement("update scoala set fax = ? where id_scoala = ?");
        preparedStatement.setString(1,fax);
        preparedStatement.setInt(2,id_scoala);
        preparedStatement.execute();

    }
    public void updateAdresaScoala(int id_scoala, String adresa) throws SQLException {
        Serviciu serv = new Serviciu();
        Scoala scoala = serv.gaseste_scoala(id_scoala);
        PreparedStatement preparedStatement = connection.prepareStatement("update scoala set adresa = ? where id_scoala = ?");
        preparedStatement.setString(1,adresa);
        preparedStatement.setInt(2,id_scoala);
        preparedStatement.execute();

    }
    public void updateNumeProfesor(int id_profesor, String nume) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set last_name = ? where id_profesor = ?");
        preparedStatement.setString(1,nume);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateTelProfesor(int id_profesor, String telefon) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set telefon = ? where id_profesor = ?");
        preparedStatement.setString(1,telefon);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateAdresaProfesor(int id_profesor, String adresa) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set adresa = ? where id_profesor = ?");
        preparedStatement.setString(1,adresa);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateLocProfesor(int id_profesor, String loc) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set localitate = ? where id_profesor = ?");
        preparedStatement.setString(1,loc);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateSalariuProfesor(int id_profesor, int salariu) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set salariu = ? where id_profesor = ?");
        preparedStatement.setInt(1,salariu);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateDiriginteProfesor(int id_profesor, boolean diriginte) throws SQLException {
        Serviciu serv = new Serviciu();
        Profesor profesor = serv.gaseste_profesor(id_profesor);
        PreparedStatement preparedStatement = connection.prepareStatement("update profesor set diriginte = ? where id_profesor = ?");
        preparedStatement.setBoolean(1,diriginte);
        preparedStatement.setInt(2,id_profesor);
        preparedStatement.execute();

    }
    public void updateNumeParinte(int id_parinte, String nume) throws SQLException {
        Serviciu serv = new Serviciu();
        ParinteSauTutore parinte = serv.gaseste_parinte(id_parinte);
        PreparedStatement preparedStatement = connection.prepareStatement("update parinte set nume = ? where id_parinte = ?");
        preparedStatement.setString(1,nume);
        preparedStatement.setInt(2,id_parinte);
        preparedStatement.execute();

    }
    public void updateTelParinte(int id_parinte, String telefon) throws SQLException {
        Serviciu serv = new Serviciu();
        ParinteSauTutore parinte = serv.gaseste_parinte(id_parinte);
        PreparedStatement preparedStatement = connection.prepareStatement("update parinte set telefon = ? where id_parinte = ?");
        preparedStatement.setString(1,telefon);
        preparedStatement.setInt(2,id_parinte);
        preparedStatement.execute();

    }
    public void updateAdresaParinte(int id_parinte, String adresa) throws SQLException {
        Serviciu serv = new Serviciu();
        ParinteSauTutore parinte = serv.gaseste_parinte(id_parinte);
        PreparedStatement preparedStatement = connection.prepareStatement("update parinte set adresa = ? where id_parinte = ?");
        preparedStatement.setString(1,adresa);
        preparedStatement.setInt(2,id_parinte);
        preparedStatement.execute();

    }
    public void updateCIParinte(int id_parinte, String serie_nr_ci) throws SQLException {
        Serviciu serv = new Serviciu();
        ParinteSauTutore parinte = serv.gaseste_parinte(id_parinte);
        PreparedStatement preparedStatement = connection.prepareStatement("update parinte set serie_nr_ci = ? where id_parinte = ?");
        preparedStatement.setString(1,serie_nr_ci);
        preparedStatement.setInt(2,id_parinte);
        preparedStatement.execute();

    }
    public void updateNumeElev(int id_elev, String nume) throws SQLException {
        Serviciu serv = new Serviciu();
        Elev elev = serv.gaseste_elev(id_elev);
        PreparedStatement preparedStatement = connection.prepareStatement("update elev set nume = ? where nr_matricol = ?");
        preparedStatement.setString(1,nume);
        preparedStatement.setInt(2,id_elev);
        preparedStatement.execute();

    }
    public void updateCatElev(int id_elev, int nr_catalog) throws SQLException {
        Serviciu serv = new Serviciu();
        Elev elev = serv.gaseste_elev(id_elev);
        PreparedStatement preparedStatement = connection.prepareStatement("update elev set nr_catalog = ? where nr_matricol = ?");
        preparedStatement.setInt(1,nr_catalog);
        preparedStatement.setInt(2,id_elev);
        preparedStatement.execute();

    }
    public void updateClsElev(int id_elev, int id_clasa) throws SQLException {
        Serviciu serv = new Serviciu();
        Elev elev = serv.gaseste_elev(id_elev);
        PreparedStatement preparedStatement = connection.prepareStatement("update elev set id_clasa = ? where nr_matricol = ?");
        preparedStatement.setInt(1,id_clasa);
        preparedStatement.setInt(2,id_elev);
        preparedStatement.execute();

    }
    public void updateAdresaElev(int id_elev, String adresa) throws SQLException {
        Serviciu serv = new Serviciu();
        Elev elev = serv.gaseste_elev(id_elev);
        PreparedStatement preparedStatement = connection.prepareStatement("update elev set adresa = ? where nr_matricol = ?");
        preparedStatement.setString(1,adresa);
        preparedStatement.setInt(2,id_elev);
        preparedStatement.execute();

    }



}