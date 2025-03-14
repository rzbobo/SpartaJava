package kiosk04;

import java.util.*;

public class Kiosk {
    // 필드
    List<Menu> menuList;

    // 생성자
    public Kiosk() {
        this.menuList = new ArrayList<>();  // 생성자
    }

    // 메서드
    public void showMainMenu() {
        System.out.println("[ MAIN MENU ]");
        int i = 1;
        for (Menu menu : menuList) {
            System.out.println(i + ". " + menu.category);
            i++;
        }
        System.out.println("0. 종료 |종료");
    }

    // 입력과 반복문 로직을 포함하는 메서드 start
    public void start() {

        // 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 숫자 입력 전 변수 선언 및 초기화
        int num1 = 0;
        // 반복문 시작


        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            showMainMenu();
            // -> 메뉴 클래스의 // 숫자 입력 받기
            System.out.println("번호를 입력하세요 : ");
            num1 = sc.nextInt();

            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
            // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
            if (num1 > 0 && num1 <= menuList.size()) { // num1 값을 메뉴 개수보다 적고 0보다 클 경우로 조건 설정
                Menu selectedMenu = menuList.get(num1 - 1); // 인덱스는 0부터 시작하므로 -1
                selectedMenu.showDetailMenu(); // 상세 메뉴 출력

                int num2; // 상세 메뉴에서 받을 숫자 선언
                System.out.print("메뉴를 선택하세요: ");
                num2 = sc.nextInt(); // 입력 받기

                if (num2 == 0) {
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    continue;
                }

                if (num2 > 0 && num2 <= selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(num2 - 1);
                    System.out.println("선택한 메뉴: " + selectedItem);
                } else {
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                }
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }

            // 숫자 입력 받기

            // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기

            // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.

        }
    }
/**
 switch (num1) {
 case 1 -> {
 System.out.println("1 : 키오스크 프로그램을 실행합니다.");
 }
 case 2 -> System.out.println("2 : 수동 설정 - 메뉴 불러오기");
 case 3 -> System.out.println("3 : 수동 설정 - 메뉴 출력하기");
 case 4 -> System.out.println("4 : 수동 설정 - 메뉴 추가하기");
 case 5 -> System.out.println("5 : 종료 - 종료");
 case 6 -> System.out.println("실행할 선택지의 번호를 입력해주세요.");
 default -> System.out.println("잘못된 명령어로 인한 실행 오류입니다.");
 }
 **/