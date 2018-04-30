package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lecturerSql extends layerMySql {

    public lecturerSql() {
        checkAndConnect();
    }

    public void printAllAbsWithCourseID(String courseId) {
        checkAndConnect();

        String query;
        query = "select * from absentism where CourseID='" + courseId + "'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Student ID : " + rs.getString(1));
                System.out.println("Course  ID : " + rs.getString(2));
                System.out.println("Absentisim : " + rs.getString(3) + "\n");
            }


        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


    }

    public void printAllCoursesAbs() {
        checkAndConnect();

        String query = "select CourseID,StudentID,Abs from absentism order by CourseID asc ,StudentID asc";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Course  ID : " + rs.getString(1));
                System.out.println("Student ID : " + rs.getString(2));
                System.out.println("Absentisim : " + rs.getString(3) + "\n");

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void editAbsentism(String stdId, String courseId, String changeAbs) {
        checkAndConnect();

        //String query1 = "select Abs from absentism where StudentID='" + courseId + "'";
        /*String query = "update absentism\n" +
                "set Abs ='" + changeAbs + "'" +
                "where StudentID ='" + stdId + "' and CourseID ='" + courseId + "'";
        */
        //String query = "update absentism set Abs = '" + changeAbs + "'" +
        //       "where StudentID = 2018001 and CourseID = 'SE 311' ";

        String query = "update absentism set Abs = ? where StudentID = ? and CourseID = ? ";


        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, changeAbs);
            stmt.setString(2, stdId);
            stmt.setString(3, courseId);
            stmt.executeUpdate();


            //ResultSet rs = stmt.executeQuery(query);

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public void feeStatus() {
        checkAndConnect();

        String query = "select ID,FeeStatus from student order by FeeStatus asc";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Student Name  : " + rs.getString(1));
                System.out.println("Fee status    : " + rs.getString(2) + "\n");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
