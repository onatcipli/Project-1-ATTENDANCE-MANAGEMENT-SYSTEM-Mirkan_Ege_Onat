import Login.mainMenu;
import Login.menu;
import database.layerMySql;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        layerMySql sql = new layerMySql();
        sql.connect();

        mainMenu mainMenu = new mainMenu();





    }
}
