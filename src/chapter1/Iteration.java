package chapter1;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("신호등 색깔을 정해주세요!");

        String light = sc.nextLine();

        if (light.equals("초록불")) {
            System.out.println("건너세요!");
        } else if (light.equals("노란불")) {
            System.out.println("곧 신호가 바뀌어요!");
        }
        else {
            System.out.println("멈추세요!");
        }


        System.out.println("...");
    }
}
