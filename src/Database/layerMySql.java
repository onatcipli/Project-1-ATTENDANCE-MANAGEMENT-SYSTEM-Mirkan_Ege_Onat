package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class layerMySql {


    public Connection conn;
    String dbUrl = "jdbc:mysql://localhost:3306/attendancemanagement";
    String user = "root";
    String databasePassword = "1234tamam";

    //This function is for connecting to the Database
    public Connection connect() {
        //System.out.println("Trying to connect to the Database !!!");
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

    //This function check the Database is connect or not if its not call connect func
    public void isConnected() {
        if (conn == null) {
            //System.out.println("Connection Error, Trying again....");
            connect();
        }
    }

    public boolean isConn() {
        if (conn == null) {
            return false;
        } else return true;
    }

    // return type is string to get info about user's type
    public String isValid(String id, String password) throws Exception {
        isConnected();

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

}
