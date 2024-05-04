public class MenuItem {
    private double itemPrice;
    private int currentDate = 365;
    private String itemDescription;
    private final String itemCategory;
    private final int itemDate;

    public MenuItem(double itemPrice, String itemDescription, String itemCategory, int itemDate) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemDate = itemDate;
    }

    public MenuItem(double itemPrice, String itemDescription, String itemCategory) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemDate = currentDate;
    }

    public int getItemDate() {
        return itemDate;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    @Override
    public String toString() {
        return  "Description: " + itemDescription + '\'' +
                ", Price: " + itemPrice +
                ", Category: '" + itemCategory + '\'' +
                ", Made on: " + itemDate;
    }
}
