package kiosk0405;

public class App {
    public static void main(String[] args) {

        // Menu 객체 생성하면서 카테고리 이름 설정
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgers.addMenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgers.addMenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgers.addMenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgers.addMenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        drinks.addMenuItem("Coke", 2.3, "콜라");
        drinks.addMenuItem("Sprite", 2.3, "사이다");
        drinks.addMenuItem("Lemonade", 3.3, "오렌지주스");

        desserts.addMenuItem("Ice Cream", 4.0, "딸기 아이스크림");
        desserts.addMenuItem("Chocolate Cake", 5.1, "케이크");


        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();

        // Kiosk의 menuList에 메뉴 추가
        kiosk.getMenuList().add(burgers);
        kiosk.getMenuList().add(drinks);
        kiosk.getMenuList().add(desserts);

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}
