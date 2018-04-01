import java.util.ArrayList;

public class Admin {

    private String username;
    private String password;
    private Teacher teacher;
    private Student student;

    ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    ArrayList<Student> studentList = new ArrayList<Student>();

    public Admin(String username, String password) {
        setAdminUsername(username);
        setAdminPassword(password);
    }

    public void setAdminUsername(String username) {
        this.username = username;
    }

    public void setAdminPassword(String password) {
        this.password = password;
    }

    public String getAdminUsername() {
        return this.username;
    }

    public String getAdminPassword() {
        return this.password;
    }

    public void addNewTeacher(String name, String surname, String lectureName) {

        teacher = new Teacher(name, surname, lectureName);
        teacherList.add(teacher);

    }

    public Teacher getTeacher(String name, String surname) {

        Teacher tc = new Teacher();

        for (int i = 0; i < teacherList.size(); i++) {

            tc = teacherList.get(i);
            if (tc.getName().equals(name) && tc.getSurname().equals(surname)) {
                return tc;
            } else {
                System.out.printf("That teacher cannot be found");

            }

        }
        return tc;
    }

    public void addNewStudent(String name, String surname, int absenteeism) {

        student = new Student(name, surname, absenteeism);
        teacher.setTeacherStudent(student);

    }

    public Student getStudent(String name, String surname) {

        Student std = new Student();

        for (int i = 0; i < studentList.size(); i++) {

            std = studentList.get(i);
            if (std.getName().equals(name) && std.getSurname().equals(surname)) {
                return std;
            } else {
                System.out.printf("That student cannot be found");

            }

        }
        return std;
    }


}

