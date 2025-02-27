package chapter1;

import java.util.Scanner;
public class UserInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        // TODO: 사용자로부터 이름을 입력받기

        int age = scanner.nextInt();
        // TODO: 사용자로부터 나이를 입력받기

        System.out.println("이름을 입력하세요 : " + userName);
        System.out.println("나이를 입력하세요 : " + age);
        // TODO: 입력받은 값 출력
    }
}