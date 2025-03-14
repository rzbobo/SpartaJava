package kiosk02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {


        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
        menuItems.add(new MenuItem("종료", 0, "종료"));

        int i = 1; // 번호 입력을 위해 향상된 for문의 조건에는 넣지 못하니 외부에서 따로 추가한 변수
        for (MenuItem menuItem : menuItems) {
            System.out.println(i + "." + menuItem);
            i++;
        }
        i = 1; // 이후에 전체메뉴를 출력하게될 수 있으니 초기화

        System.out.println("추가하실 메뉴의 정보를 입력해주세요!");
        System.out.println("* 추가하실 메뉴가 없다면, x를 입력해주세요! *");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("메뉴 : ");
            String input1 = sc.nextLine();
            if (input1.equals("x")) {
                break; // 입력값 검사 후 x일 시, 반복문 탈출
            } else {
            System.out.print("가격 : ");
            double input2 = sc.nextDouble();
            sc.nextLine(); // 버퍼 비우기
            System.out.print("설명 : ");
            String input3 = sc.nextLine();
            menuItems.add(new MenuItem(input1, input2, input3));
                System.out.println("전체 메뉴를 출력하겠습니다.");
            for (MenuItem menuItem : menuItems) {
                System.out.println(i + "." + menuItem);
                i++;
            }
            System.out.println("* 추가하실 메뉴가 없다면, x를 입력해주세요! *");
            }
        }
        System.out.println("종료하겠습니다.");
        sc.close();
    }



}