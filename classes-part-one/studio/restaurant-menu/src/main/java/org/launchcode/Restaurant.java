import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem frenchFries = new MenuItem(3.50, "French Fries", "appetizer");
        MenuItem plainPizza = new MenuItem(12.50, "Plain Pizza", "main course");
        MenuItem cheeseSteak = new MenuItem(10.00, "Cheesesteak", "main course", 300);
        MenuItem chocoCake = new MenuItem(4.50, "Chocolate Cake", "dessert", 10);

        ArrayList<MenuItem> newMenu = new ArrayList<>();

        Menu fullMenu = new Menu(newMenu);

        fullMenu.addToMenu(frenchFries);
        fullMenu.addToMenu(plainPizza);
        fullMenu.addToMenu(cheeseSteak);
        fullMenu.addToMenu(chocoCake);

        fullMenu.printFullMenu();

        // System.out.println(fullMenu);

        // fullMenu.removeFromMenu(cheeseSteak);

        // fullMenu.printFullMenu();

        fullMenu.printSingleItem(plainPizza);
    }
}
