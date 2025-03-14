package kiosk03;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kisok 안내문");
        System.out.println("1 : 키오스크 프로그램을 실행합니다.");
        System.out.println("2 : 수동 설정 - 메뉴 불러오기");
        System.out.println("3 : 수동 설정 - 메뉴 출력하기");
        System.out.println("4 : 수동 설정 - 메뉴 추가하기");
        System.out.println("5 : 종료 - 종료");
        System.out.println("실행할 선택지의 번호를 입력해주세요.");
        int num = 0;
        while (true) {
            if(num == 5){
                System.out.println("종료하겠습니다.");
                break;
            }
            num = sc.nextInt();
            switch (num) {
                case 1 -> { // 키오스크 프로그램 실행
                    System.out.println("키오스크 프로그램을 실행합니다.");
                    System.out.println("내재된 명령을 수행합니다.");
                    System.out.println("-----메뉴 불러오기-----메뉴 출력-----메뉴 추가-----");
                    kiosk.start();
                }
                case 2 -> {
                    System.out.println("수동 설정 - 메뉴 불러오기");
                    System.out.println("키오스크의 기존 메뉴를 불러옵니다.");
                    kiosk.bringMenu();
                }
                case 3 -> {
                    System.out.println("수동 설정 - 메뉴 출력하기");
                    System.out.println("현재 메뉴를 출력합니다.");
                    kiosk.printMenu();
                }
                case 4 -> {
                    System.out.println("수동 설정 - 메뉴 추가하기");
                    System.out.println("새로운 메뉴를 추가합니다.");
                    kiosk.addMenu();
                }
                default -> System.out.println("잘못된 명령어로 인한 실행 오류입니다.");
            }

        }

    }
}