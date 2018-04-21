
package Login;

import java.util.Scanner;
import database.layerMySql;


public class mainMenu implements menu {

    String Id,pass,type;
    Scanner scan = new Scanner(System.in);
    layerMySql sql = new layerMySql();

    public mainMenu() {
        Id = null;
        pass = null;
        type = null;
        printMenu();
    }

    @Override
    public void printMenu() {
        System.out.println("\t\t*** Main Menu ***");
        System.out.println("Please enter your ID and Password");
        System.out.print("\tID   :  ");
        Id = scan.nextLine();
        System.out.print("\tPass :  ");
        pass = scan.nextLine();


        try {
            type = sql.isValid(Id, pass);
            if (type == null) {
                System.out.println("Invalid User Credentials , Try Again");
                printMenu();
            }else if (type != null) {
                makeMenuSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeMenuSelection() {
        System.out.println("make menu selection  -> " + type);
        if (type == null) {
            System.out.println("Your ID or Password is in correct please try again...");
            printMenu();
        } else if (type.equals("s")) {// This is will call student Menu

        } else if (type.equals("t")) {// This is will call teacher Menu

        } else if (type.equals("a")) {// This is will call admin Menu
            
        } 
        
    }

    public String checkID() {
        String x;

        return null;
    }

}