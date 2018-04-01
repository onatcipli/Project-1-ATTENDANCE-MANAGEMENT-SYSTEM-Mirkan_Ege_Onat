public class Main {

    public static void main(String[] args) {

        Admin systemAdmin = new Admin("ege", "ege123");

        systemAdmin.addNewTeacher("onat","çipli","Inteliji short cuts 101");

        Teacher headTeacher = new Teacher();

        headTeacher = systemAdmin.getTeacher("onat","çipli");

        headTeacher.displayInfo();

        systemAdmin.addNewStudent("ege","deliguru",0);

        systemAdmin.addNewStudent("mirkan","çalışkan",0);

        Student std1 = systemAdmin.getStudent("ege","deliguru");

        Student std2 = systemAdmin.getStudent("mirkan","çalışkan");

        std1.displayInfo();

        std2.displayInfo();






    }
}
