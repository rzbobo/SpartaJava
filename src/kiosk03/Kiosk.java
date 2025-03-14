package kiosk03;

import java.util.*;

public class Kiosk {
    // 필드
    List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    public Kiosk() {
        this.menuItems = new ArrayList<>();  // 생성자
    }

    // 메서드

    // 기존 메뉴 가져오기
    public void bringMenu() {
        System.out.println("기존 메뉴를 불러옵니다.");
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 메뉴 출력하기
    public void printMenu() {
        System.out.println("현재 등록된 메뉴를 출력하겠습니다.");
        if (menuItems.size() > 0) {
            int i = 1;
            for (MenuItem menuItem : menuItems) {
                System.out.println(i + "." + menuItem);
                i++;
            }
            System.out.println("0.종료 | 종료 ");
        } else {
            System.out.println("현재 등록된 메뉴가 없습니다.");
            System.out.println("메뉴를 추가해주세요.");
        }
    }

    // 새로운 메뉴 가져오기
    public void addMenu() {
        System.out.println("추가하실 메뉴의 정보를 입력해주세요!");
        System.out.println("* 추가하실 메뉴가 없다면, x를 입력해주세요! *");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("메뉴 : ");
            String input1 = sc.nextLine();
            sc.nextLine(); // 버퍼 비우기
            if (input1.equals("x")) {
                break; // 입력값 검사 후 x일 시, 반복문 탈출
            } else {
                System.out.print("가격 : ");
                double input2 = sc.nextDouble();
                sc.nextLine();// 버퍼 비우기
                System.out.print("설명 : ");
                String input3 = sc.nextLine();
                menuItems.add(new MenuItem(input1, input2, input3));
                System.out.println("전체 메뉴를 출력하겠습니다.");
                printMenu();
                System.out.println("* 추가하실 메뉴가 없다면, x를 입력해주세요! *");
            }

        }
    }

        // 입력과 반복문 로직을 포함하는 메서드 start
        public void start() {
            bringMenu();
            printMenu();
            addMenu();
        }


}
