public class Student {


    private String name;
    private String surname;
    private int absenteeism;

    public Student( ){

    }

    public Student(String name, String surname, int absenteeism) {
        this.name = name;
        this.surname = surname;
        this.absenteeism = absenteeism;
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

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    public void displayInfo(  ){
        System.out.println("  Name :  " + name + "  Surname:  " + surname + "  Given Lecture:  " + absenteeism );
    }
}
