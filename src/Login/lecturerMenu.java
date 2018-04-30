package Login;

import Database.*;


public class lecturerMenu implements menu {


    lecturerSql sqlLecturer = new lecturerSql();


    public lecturerMenu() {
        printMenu();

    }

    @Override
    public void printMenu() {
        System.out.println("\t\t\t Teacher Menu");
        System.out.println("Please chose your action from the menu!");
        System.out.println("1-)Absentisms");
        System.out.println("2-)Enter Course ID and See absenteisms");
        System.out.println("3-)Check fee status of a student");
        System.out.println("4-)Edit Absentism //Not working now in version 3 it will be added");

        makeMenuSelection();
    }

    @Override
    public void makeMenuSelection() {
        int menuInput = 0;
        menuInput = scan.nextInt();
        scan.nextLine();
        switch (menuInput) {
            case 1:
                absentismAscCourseId();
                printMenu();
                break;
            case 2:
                seeAbsentismWithCourseId();
                printMenu();
                break;
            case 3:
                seeFeeStatus();
                printMenu();
                break;
            case 4:
                System.out.println("Do you want to see All absentism and Student ID\nif yes enter 1 if no press 0");
                int selection = scan.nextInt();
                scan.nextLine();
                if (selection == 1) {
                    absentismAscCourseId();
                }
                editAbsentism();
                printMenu();
                break;
            default:
                System.out.println("There was a problem please make a selection again");
                printMenu();
                break;
        }
    }

    public void absentismAscCourseId() {
        sqlLecturer.printAllCoursesAbs();
    }

    public void seeAbsentismWithCourseId() {
        System.out.print("Please write your course ID that you want to see Absentisim : ");
        String courseId = scan.nextLine();
        sqlLecturer.printAllAbsWithCourseID(courseId.toUpperCase());


    }

    public void seeFeeStatus() {
        System.out.println("All Students Fee Status");
        sqlLecturer.feeStatus();
    }

    public void editAbsentism() {
        System.out.println("Please enter the Course ID which you want to change him/her absentism : ");
        String selectedCourse = scan.nextLine();
        System.out.println("Please enter the Student ID which you want to change him/her absentism : ");
        String selectedStudent = scan.nextLine();
        System.out.println("Please enter the value of absentism : ");
        String changedAbs = scan.nextLine();


        sqlLecturer.editAbsentism(selectedStudent, selectedCourse.toUpperCase(), changedAbs);

    }


}
