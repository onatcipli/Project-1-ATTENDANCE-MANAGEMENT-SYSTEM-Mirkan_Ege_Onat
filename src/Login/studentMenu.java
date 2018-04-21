package Login;





public class studentMenu implements menu {


    public studentMenu() {

    }

    //Student menu which is proceed by mainMenu function
    @Override
    public void printMenu() {
        System.out.println("\t\t\t Student Menu");
        System.out.println("Please chose your action from the menu!");
        System.out.println("1-)Add an student"); //This functionality will be removed from here it will added to the admin functionality later on
        System.out.println("2-)See grades and scores");
        System.out.println("3-)Check fee status");
        System.out.println("4-)Check absentism");

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