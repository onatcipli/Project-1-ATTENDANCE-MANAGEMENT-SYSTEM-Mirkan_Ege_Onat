package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminSql extends layerMySql {

    public adminSql() {
        super.isConnected();
    }

    public void insertStudent(String[] course) throws Exception {
        isConnected();
        if (course.length != 11) {
            throw new Exception();
        }
        try {
            String query = "insert into student values (?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);

            for (int i = 0; i < 11; i++) {
                stmt.setString(1 + i, course[i]);
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

            int stdCounter = 1;
            while (rs.next()) {
                System.out.println((stdCounter++) + ".\t\t||Student||");
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

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertTeacher(String[] teacher) {

        isConnected();
        if (teacher.length != 2) {
            throw new ArrayIndexOutOfBoundsException();
        }

        try {
            String query = "insert into lecturer values (?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);

            for (int i = 0; i < teacher.length; i++) {
                stmt.setString(1 + i, teacher[i]);
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

            int teacherCounter = 1;
            while (rs.next()) {
                System.out.println((teacherCounter++) + ".\t\t||Teacher||");
                System.out.println("Name   : " + rs.getString(1) + " ");
                System.out.println("ID     : " + rs.getString(2) + "\n");
            }

            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
