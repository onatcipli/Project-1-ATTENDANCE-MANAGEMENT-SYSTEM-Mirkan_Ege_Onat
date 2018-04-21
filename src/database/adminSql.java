package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminSql extends layerMySql {

    public adminSql() {
        super.checkAndConnect();
    }

    public void insertStundent(String[] course) {
        checkAndConnect();

        try {
            String query = "insert into student values (?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);



            for (int i = 0; i < 11 ; i++) {
                stmt.setString(1+i, course[i]);
            }

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listStudent() {
        try {
            String query = "select * from student";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+" ");
                System.out.print(rs.getString(4)+" ");
                System.out.print(rs.getString(5)+" ");
                System.out.print(rs.getString(6)+" ");
                System.out.print(rs.getString(7)+" ");
                System.out.print(rs.getString(8)+" ");
                System.out.print(rs.getString(9)+" ");
                System.out.print(rs.getString(10)+" ");
                System.out.println(rs.getString(11));
            }

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertTeacher(String[] teacher) {

        checkAndConnect();

        try {
            String query = "insert into lecturer values (?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);

            for (int i = 0; i < teacher.length ; i++) {
                stmt.setString(1+i, teacher[i]);
            }

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public void listTeacher() {
        try {
            String query = "select * from lecturer";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString(1)+" ");
                System.out.println(rs.getString(2));
            }

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
