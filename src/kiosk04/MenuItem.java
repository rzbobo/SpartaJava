package kiosk04;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
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