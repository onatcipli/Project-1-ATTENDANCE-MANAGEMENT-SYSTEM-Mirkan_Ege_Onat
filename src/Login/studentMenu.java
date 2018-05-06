package Login;

import Database.*;

public class studentMenu implements menu {

    static String stdID = null;
    studentSql sqlStudent = new studentSql();

    public studentMenu() {

        printMenu();

    }

    public studentMenu(String stdID) {
        this.stdID = stdID;
        printMenu();
    }

    //Student menu which is proceed by mainMenu function
    @Override
    public void printMenu() {
        System.out.println("\t\t*** Student Menu ***");
        System.out.println("Please chose your action from the menu!");
        System.out.println("1-)See my status");
        System.out.println("2-)See grades and scores // maybe It will be added later");
        System.out.println("3-)Check fee status");
        System.out.println("4-)Check absentism");
        System.out.println("5-)Log out");


        makeMenuSelection();
    }

    @Override
    public void makeMenuSelection() {
        int menuAct = 0;
        menuAct = scan.nextInt();
        scan.nextLine();
        switch (menuAct) {
            case 1:
                seeMyStatus();
                printMenu();
                break;
            case 2:

                printMenu();
                break;
            case 3:
                checkFeeStatus();
                printMenu();
                break;
            case 4:
                checkAbsentism();
                printMenu();
                break;
            case 5:
                mainMenu loginAgain = new mainMenu();
                break;
            default:
                System.out.println("Your enter invalid menu number please enter again");
                printMenu();
                break;
        }

    }

    public void seeMyStatus() {
        sqlStudent.seeStatus(stdID);
    }

    public void checkFeeStatus() {
        sqlStudent.checkMyFee(stdID);
    }

    public void checkAbsentism() {
        sqlStudent.checkAbsSql(stdID);

    }

}