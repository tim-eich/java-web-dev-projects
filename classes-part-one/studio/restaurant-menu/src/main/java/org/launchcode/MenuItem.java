public class MenuItem {
    private int itemPrice;
    private String itemDescription;
    private String itemCategory;
    private int itemDate;

    public MenuItem(int itemPrice, String itemDescription, String itemCategory, int itemDate) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemDate = itemDate;
    }

    public int getItemDate() {
        return itemDate;
    }
}
