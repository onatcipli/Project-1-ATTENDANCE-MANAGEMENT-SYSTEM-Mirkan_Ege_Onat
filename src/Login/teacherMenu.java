package Login;

public class teacherMenu implements menu {


    public teacherMenu() {

        printMenu();

    }

    @Override

    public void printMenu() {
        System.out.println("\t\t\t Teacher Menu");
        System.out.println("Please chose your action from the menu!");
        System.out.println("1-)See the students grades and edit");
        System.out.println("2-)Edit the absentism");
        System.out.println("3-)Check fee status of a student");
        System.out.println("4-)Check the absentism");
    }

    @Override
    public void makeMenuSelection() {
        int menuInput = -1;

        switch (menuInput) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }

    }
}
