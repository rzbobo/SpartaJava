package kiosk02;

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
        if (price == 0) {
            return menuName + " | "  + text;

        }
        return menuName + " | W " + price + " | " + text;
    }

}