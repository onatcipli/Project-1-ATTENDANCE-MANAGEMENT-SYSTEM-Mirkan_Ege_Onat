package Database;

import java.sql.ResultSet;
import java.sql.Statement;

public class studentSql extends layerMySql {

    public studentSql() {
        super.isConnected();
    }

    public void seeStatus(String stdID) {
        isConnected();

        String query = "Select * from student where ID ='" + stdID + "'";


        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()) {
                System.out.println("My Status ");
                System.out.println("ID          : " + rs.getString(1) + "\t");
                System.out.println("Name        : " + rs.getString(2) + "\t");
                System.out.println("Fee Status  : " + rs.getString(3) + "\t");
                System.out.println("CourseID 1  : " + rs.getString(4) + "\t");
                System.out.println("CourseID 2  : " + rs.getString(5) + "\t");
                System.out.println("CourseID 3  : " + rs.getString(6) + "\t");
                System.out.println("CourseID 4  : " + rs.getString(7) + "\t");
                System.out.println("CourseID 5  : " + rs.getString(8) + "\t");
                System.out.println("CourseID 6  : " + rs.getString(9) + "\t");
                System.out.println("CourseID 7  : " + rs.getString(10) + "\t");
                System.out.println("CourseID 8  : " + rs.getString(11) + "\n");
            }


        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void checkMyFee(String stdID) {
        isConnected();

        String query = "Select Name,ID,FeeStatus from student where ID ='" + stdID + "'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Name        : " + rs.getString(1));
                System.out.println("Std ID      : " + rs.getString(2));
                System.out.println("My Fee Statu: " + rs.getString(3));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void checkAbsSql(String stdID) {
        isConnected();

        String query = "select * from absentism where StudentID='" + stdID + "' order by CourseID asc";

        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Student ID : " + rs.getString(1));
                System.out.println("Course  ID : " + rs.getString(2));
                System.out.println("Absentisim : " + rs.getString(3) + "\n");

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
