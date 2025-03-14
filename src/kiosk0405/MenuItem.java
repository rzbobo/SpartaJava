package kiosk0405;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String menuName;
    private double price;
    private String text;

    public MenuItem(String menuName, double price, String text) {
        this.menuName = menuName;
        this.price = price;
        this.text = text;
    }


    @Override
    public String toString() {
        return menuName + " | W " + price + " | " + text;
    }

    // 게터 세터
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

