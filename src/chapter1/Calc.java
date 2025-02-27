package chapter1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("a의 값을 입력하세요");
        int a = sc.nextInt();
        System.out.println("b의 값을 입력하세요");
        int b = sc.nextInt();


        // 1. 더하기
        int plus = a + b;
        System.out.println("a + b = " + plus);

        // 2. 빼기
        int minus = a - b;
        System.out.println("a - b = " + minus);

        // 3. 곱하기
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 4. 나누기
        int division = a / b;
        System.out.println("a / b = " + division);

        // 5. 나머지 구하기
        int moduler = a % b;
        System.out.println("a % b = " + moduler);


        // 1. 더하기 결과 출력


        // 2. 빼기 결과 출력

        //....
    }

}