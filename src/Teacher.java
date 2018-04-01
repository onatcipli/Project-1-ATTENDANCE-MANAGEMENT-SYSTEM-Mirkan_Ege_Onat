import java.util.ArrayList;

public class Teacher {

    private String name;
    private String surname;
    private String lectureName;
    private Student student;

    ArrayList<Student> studentList = new ArrayList<Student>();

    public Teacher(String name, String surname, String lectureName) {
        this.name = name;
        this.surname = surname;
        this.lectureName = lectureName;

    }

    public Teacher() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public void setTeacherStudent( Student std ){

        studentList.add(std);

    }

    public void increaseAbs(Student std) {
        int currentAbs = std.getAbsenteeism() + 1;
        std.setAbsenteeism(currentAbs);
    }

    public Student getStudent(String name, String surname) {

        Student std = new Student();

        for (int i = 0; i < studentList.size(); i++) {

            std = studentList.get(i);
            if (std.getName().equals(name) && std.getSurname().equals(surname)) {
                return std;
            }else{
                System.out.printf("That student cannot be found");

            }

        }
    return std;
    }

    public void displayInfo(  ){
        System.out.println("  Name :  " + name + "  Surname:  " + surname + "  Given Lecture:  " + lectureName );
    }


}
