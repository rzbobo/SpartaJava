package calc02;
import java.util.ArrayList;

public class Calculator {
    // 결과값을 반환하는 메서드

    // 변수 선언

    private int num1; // 숫자 1
    private int num2;  // 숫자 2
    private char operator; // 기호
    private ArrayList<String> result = new ArrayList<>();

    // 메서드

    // 연산하기
    // setter로 입력값을 가져오기 때문에 매개변수를 메서드에서 직접 받지 않는다.
    public void calculate() {


        Number opResult;

        // switch문 작성 시, ':' 작성 방식과 '->' 작성 방식이 존재하는데,
        // '->' 작성 방식은 여러 줄일 경우 {} 필요
        // jdk 12 이상에서 지원하는 '->' 작성방식을 사용하면 break를 생략해도 된다.
        // 반면에 ':' 방식은 jdk11 이하 버전에서 사용하면 되고 break를 사용해야 다음과정으로 안 넘어간다.
        switch (operator) {
            case '+' -> opResult = num1 + num2;
            case '-' -> opResult = num1 - num2;
            case '*' -> opResult = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다."); // 0 나눗셈 오류 방지 및 유효성 검사
                    return;
                } else {
                    opResult = (double) num1 / num2;
                }
            }
            default -> {
                System.out.println("불가능한 연산자입니다.");
                return;
            }
        }
        String history = num1 + " " + operator + " " + num2 + " = " + opResult;
        result.add(history);
        System.out.println("연산 결과 : " +history);
    }


    // 결과값이 존재할 시, 가장 먼저 저장된 결과값 지우기
    public void removeFirstResult() {
        if (!result.isEmpty()) {
            result.remove(0);
        }
    }
    // 결과값이 존재할 시, 바로 직전 결과값 지우기
    public void removeResult() {
        if (!result.isEmpty()) {
            result.remove(result.size() - 1);
        }
    }
    // 결과값 모두 지우기
    public void clearResult() {
        if (!result.isEmpty()) {
            result.clear();
        }
    }


    //게터, 세터

    // 결과 값 저장하기
    // 게터 사용하기
    public ArrayList<String> getResult() {
        return result;
    }

    // 매개 변수 설정하기
    // 세터 사용하기
    public void setNum1(int num1) {
            this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public void setOperator(char operator) {
        this.operator = operator;
    }
}
