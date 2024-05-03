import java.util.ArrayList;

public class Menu {
    private static int currentDate;
    private static int lastUpdated;
    private ArrayList<MenuItem> fullMenu;

    public void addItem(MenuItem item) {
        fullMenu.add(item);
        lastUpdated = currentDate;
    }

    public ArrayList<MenuItem> getFullMenu() {
        return fullMenu;
    }

    public boolean isNew(MenuItem item) {
        if (this.currentDate - item.getItemDate() <= 14) {
            return true;
        } else {
            return false;
        }
    }

}
