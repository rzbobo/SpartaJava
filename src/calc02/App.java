package calc02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("----------------- 명령어 List -----------------");
        System.out.println("exit : 종료");
        System.out.println("view : 저장된 모든 연산 결과 조회");
        System.out.println("remove0 : 가장 처음 저장된 연산 결과 삭제");
        System.out.println("remove1 : 직전 연산 결과 삭제");
        System.out.println("clear : 연산 결과 모두 삭제");
        System.out.println("** 명령어가 아닌 다른 문자를 입력할 시, 다시 새로운 연산이 실행됩니다.** ");
        System.out.println("---------------------------------------------");

        Calculator calculator = new Calculator(); //인스턴스 생성
        Scanner sc = new Scanner(System.in); // Scanner
        String keyword = ""; // keyword 입력 준비

        // 반복문 시작
        while (!keyword.equals("exit")) {
            // 매개 변수 입력
            System.out.println("----------------- 계산기 프로그램 -----------------");
            System.out.print("첫 번째 숫자를 입력하세요: ");
            calculator.setNum1(sc.nextInt());
            System.out.print("사칙연산 기호를 입력하세요: ");
            calculator.setOperator(sc.next().charAt(0));
            System.out.print("두 번째 숫자를 입력하세요: ");
            calculator.setNum2(sc.nextInt());
            sc.nextLine(); // 버퍼 비우기

            // calculator 클래스를 통한 연산 진행
            // 세터로 매개 변수를 입력했기 때문에 연산에 직접적으로 입력하지 않는다.
            calculator.calculate();
            // 연산 결과 출력
            System.out.println("연산 결과 : " + calculator.getResult());

            while (!keyword.equals("another")) {
            System.out.print("다음으로 실행할 명령어를 입력해주세요 : ");


            keyword = sc.nextLine();
            switch (keyword) {
                case "remove0" -> {
                    calculator.removeFirstResult();
                    System.out.println("연산 결과 : " + calculator.getResult());
                }
                case "remove1" -> {
                    calculator.removeResult();
                    System.out.println("연산 결과 : " + calculator.getResult());
                }
                case "clear" -> {
                    calculator.clearResult();
                    System.out.println("연산 결과가 모두 삭제됐습니다.");
                }
                case "exit" -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> {
                        System.out.println("명령어가 아닌 다른 문자 입력으로 인해 새로운 연산을 시작합니다 ");
                        keyword ="another";
                }
            }
            }
            keyword = ""; // 다음 연산을 위한 키워드 초기화
        }
    }

}