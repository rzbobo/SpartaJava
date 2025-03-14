package kiosk04;

public class App {
    public static void main(String[] args) {

        // Menu 객체 생성하면서 카테고리 이름 설정
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입


        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();
        // Kiosk 내 시작하는 함수 호출
        // kiosk.start();
    }
}
