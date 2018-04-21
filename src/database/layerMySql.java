package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class layerMySql {


    public Connection conn;
    String dbUrl = "jdbc:mysql://localhost:3306/attendancemanagement";
    String user = "root";
    String databasePassword = "1234tamam";

    //This function is for connecting to the database
    public Connection connect() {
        //System.out.println("Trying to connect to the database !!!");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //System.out.println("The connection is OKEY");
            conn = DriverManager.getConnection(dbUrl, user, databasePassword);
        } catch (Exception e) {

            System.out.println("The connection is NOT OKEY");
            e.printStackTrace();
        }

        return conn;
    }

    //This function check the database is connect or not if its not call connect func
    public void checkAndConnect() {
        if (conn == null) {
            //System.out.println("Connection Error, Trying again....");
            connect();
        }
    }


    /*
     *   This queries for student class
     */

    //this is for create new lecturers to lecturer table
    public void insertToTheLecturer(String Name, String Id) {
        checkAndConnect();

        try {
            String query = "insert into lecturer values (?,?) ";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, Name);
            stmt.setString(2, Id);
            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //this is for create new
    public void insertUser(String ID, String pass, String type) {
        checkAndConnect();

        try {

            String query = "insert into login values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, ID);
            stmt.setString(2, pass);
            stmt.setString(3, type);


            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // return type is string to get info about user's type
    public String isValid(String id, String password) throws Exception {
        checkAndConnect();

        String query = "select * from login where ID='" + id + "' and pass='" + password + "'";
        PreparedStatement prepareStatement = null;
        ResultSet rs = null;

        try {
            prepareStatement = conn.prepareStatement(query);
            rs = prepareStatement.executeQuery();
            if (rs.next()) {// if ıd an pass is correct
                System.out.println(rs.getString("type"));
                return rs.getString("type");
                //We are returning a type for select the menu
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void List() {
        checkAndConnect();

    }

}
