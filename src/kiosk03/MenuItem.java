package kiosk03;

public class MenuItem {
    String menuName;
    double price;
    String text;

    public MenuItem(String menuName, double price, String text) {
        this.menuName = menuName;
        this.price = price;
        this.text = text;
    }


    @Override
    public String toString() {
        return menuName + " | W " + price + " | " + text;
    }
}