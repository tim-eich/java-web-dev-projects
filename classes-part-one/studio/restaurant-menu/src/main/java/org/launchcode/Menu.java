import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private int currentDate = 353;
    private int lastUpdated;
    private int menuCreatedOn;
    private ArrayList<MenuItem> fullMenu;

    public Menu(ArrayList<MenuItem> fullMenu) {
        this.fullMenu = fullMenu;
        lastUpdated = currentDate;
        menuCreatedOn = currentDate;
    }

    public void addToMenu(MenuItem item) {
        fullMenu.add(item);
        lastUpdated = currentDate;
    }

    public void removeFromMenu(MenuItem item) {
        fullMenu.remove(item);
    }

    public ArrayList<MenuItem> getFullMenu() {
        return fullMenu;
    }

    public int getLastMenuUpdate() {
        // System.out.println(this.lastUpdated);
        return this.lastUpdated;
    }

    public boolean isItemNew(MenuItem item) {
        if (menuCreatedOn - item.getItemDate() <= 14) {
            return true;
        } else {
            return false;
        }
    }

    public void printFullMenu() {
        for (MenuItem item : this.fullMenu) {
            System.out.print(
                    "Item: " + item.getItemDescription() + "\n" +
                    "Price: " + item.getItemPrice() + "\n" +
                    "Category: " + item.getItemCategory() + "\n"
                    );
            if (this.isItemNew(item)) {
                System.out.println(item.getItemDescription() + " is a new item!");
            }
            System.out.print("\n");
        }
        System.out.println("This menu was last updated on " + this.getLastMenuUpdate());
    }

    public void printSingleItem(MenuItem item) {
        System.out.println(item);
    }

    @Override
    public String toString() {
        return "Full Menu: " + fullMenu;
        }

    //    @Override
//    public boolean equals(Object itemToCompare) {
//        // if (this == o) return true;
//        if (itemToCompare == null || getClass() != itemToCompare.getClass()) return false;
//        MenuItem item = (MenuItem) itemToCompare;
//        return Objects.equals(fullMenu, menu.fullMenu);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(fullMenu);
//    }
}
