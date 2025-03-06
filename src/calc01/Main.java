package calc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String keyword  = "";
        while (!keyword.equals("exit")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            String tool = sc.next(); // trouble -> sc.nextline()
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (tool) {
                case "+" -> System.out.println("두 숫자의 더하기 결과 : " + (num1 + num2));
                case "-" -> System.out.println("두 숫자의 뺄셈 결과 : " + (num1 - num2));
                case "*" -> System.out.println("두 숫자의 곱하기 결과 : " + (num1 * num2));
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("0으로는 나눌 수 없습니다."); // 0 나눗셈 오류 방지
                    } else {
                        System.out.println("두 숫자의 나눗셈 결과 : " + ((double) num1 / num2 ));
                    }
                }
                default -> System.out.println("아직 구현되지 않은 기능입니다.");
            }
            System.out.println("계산을 더 하시겠습니까? [exit 입력 시 종료]");
            keyword = sc.nextLine();
            sc.nextLine(); // 버퍼 비우기
            }


        /* if 코드
        if (tool.equals("+")) {
            System.out.println("두 숫자의 더하기 결과 : "+(num1+num2));
        } else if (tool.equals("-")) {
            System.out.println("두 숫자의 뺄셈 결과 : "+(num1-num2));
        } else if (tool.equals("*")) {
            System.out.println("두 숫자의 곱하기 결과 : "+(num1*num2));
        } else if (tool.equals("/")) {
            System.out.println("두 숫자의 나눗셈 결과 : "+(num1/num2));
        } else {
            System.out.println("아직 구현되지 않은 기능입니다.");
        }*/


        }
    }
