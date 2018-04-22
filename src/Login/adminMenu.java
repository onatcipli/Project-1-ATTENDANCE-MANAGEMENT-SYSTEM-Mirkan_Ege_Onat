package Login;

import Database.*;

public class adminMenu implements menu {
    //edit alittle bit
    //git remote https://github.com/serhatuzunbayir/Project-1-ATTENDANCE-MANAGEMENT-SYSTEM-Mirkan_Ege_Onat.git --add --push origin https://github.com/serhatuzunbayir/Project-1-ATTENDANCE-MANAGEMENT-SYSTEM-Mirkan_Ege_Onat.git

    adminSql sqlAdmin = new adminSql();

    public adminMenu() {
        printMenu();
    }

    @Override
    public void printMenu() {
        System.out.println("\t\t*** Admin Menu ***");
        System.out.println("Please chose your action from the menu!");
        System.out.println("1-)Add an student"); //This functionality will be removed from here it will added to the admin functionality later on
        System.out.println("2-)Add an teacher");
        System.out.println("3-)List all students");
        System.out.println("4-)List all teacher");


        makeMenuSelection();
        //We can add more menu action later
    }

    @Override
    public void makeMenuSelection() {
        int menuAct = 0;
        menuAct = scan.nextInt();
        scan.nextLine();
        switch (menuAct) {
            case 1:
                addStudent();
                printMenu();
                break;
            case 2:
                addTeacher();
                printMenu();
                break;
            case 3:
                printAllStudents();
                printMenu();
                break;
            case 4:
                printAllTeachers();
                printMenu();
                break;
            default:
                System.out.println("Your enter invalid menu number please enter again");
                printMenu();
                break;

        }


    }

    void addStudent() {
        String[] infoForStudents = new String[11];
        System.out.println("For adding Student you should give some informations");
        System.out.print("Student ID  : ");
        infoForStudents[0] = scan.nextLine();
        System.out.print("Name        : ");
        infoForStudents[1] = scan.nextLine();
        System.out.print("Fee status  : ");
        infoForStudents[2] = scan.nextLine();
        System.out.print("Course 1    : ");
        infoForStudents[3] = scan.nextLine();
        System.out.print("Course 2    : ");
        infoForStudents[4] = scan.nextLine();
        System.out.print("Course 3    : ");
        infoForStudents[5] = scan.nextLine();
        System.out.print("Course 4    : ");
        infoForStudents[6] = scan.nextLine();
        System.out.print("Course 5    : ");
        infoForStudents[7] = scan.nextLine();
        System.out.print("Course 6    : ");
        infoForStudents[8] = scan.nextLine();
        System.out.print("Course 7    : ");
        infoForStudents[9] = scan.nextLine();
        System.out.print("Course 8    : ");
        infoForStudents[10] = scan.nextLine();

        sqlAdmin.insertStudent(infoForStudents);


    }

    void printAllStudents() {
        sqlAdmin.listStudent();
    }

    void addTeacher() {
        String[] teacherInfo = new String[2];
        System.out.println("For adding Lecturer you should give some informations");
        System.out.print("Name        : ");
        teacherInfo[0] = scan.nextLine();
        System.out.print("Teacher ID  : ");
        teacherInfo[1] = scan.nextLine();

        sqlAdmin.insertTeacher(teacherInfo);
    }

    void printAllTeachers() {
        sqlAdmin.listTeacher();
    }

}
