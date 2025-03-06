package calc02;
import java.util.ArrayList;

public class Calculator {
    // 결과값을 반환하는 메서드

    // 변수 선언

    private int num1; // 숫자 1
    private int num2;  // 숫자 2
    private char operator; // 기호
    private ArrayList<String> result = new ArrayList<>();

    // ArrayList<Integer>가 아닌 <Number>여야하는 이유
    // 결국 나눗셈 결과 값이 실수가 나올 수 있는 계산기이기 때문에
    // integer로 저장하면 실수값이 나왔을 때 처리하기 곤란
    // 따라서, 자료형 자체를 number로 선언하는 게 적합하다 생각함.
    // double로 선언 시, 정수끼리의 연산에서도 소수점이 나올 수 있기에 number가 적합함
    // 구현을 하다 보니, 연산 결과를 정말로 연산 결과값만 저장하게 되는 것이 아쉽다고 생각
    // String 방식을 통해 문자열로 받아오기 방식 채택


    // operator가 String이 아닌 char인 이유
    // 어차피 연산자는 단어 하나기 때문에 비교적 간단한 char를 사용하는 것이 적합하다 생각함
    // 이 과정에서 char 사용 시, 문자 표현할 때 ""이 아닌 ''로 표현하는 것을 다시 배움

    // 3/5일 저녁회의를 통해 유효성 검사를 진행해야 함을 깨달았음.
    // 0을 포함한 양의 정수임을 num1과 num2에 대해서 유효성 검사를 진행해야 한다.
    // 당연하게도 operator 값 또한 연산 가능한 연산자에 대해서 유효성 검사를 진행한다.
    // 나눗셈에 있는 유효성 검사를 한 메서드로 합칠 수 있는지에 대한 여부또한 고민
    // 3-1 강의에 있는 예외(Exception)과 예외처리(try-catch) 활용
    // operator


    // 메서드

    // 연산하기
    // setter로 입력값을 가져오기 때문에 매개변수를 메서드에서 직접 받지 않는다.
    public void calculate() {

        // 연산 결과를 두 개로 구분을 해야함
        // 1) 연산 값 -> opResult
        // 나눗셈의 실수 값을 고려해 Number로 선언.
        // 2) 식을 포함한 연산 값 -> result
        // 어차피 연산 값은 연산 메서드에서만 필요하니 연산 메서드 자체에서만 선언,
        // 이후 문자열에 합쳐서 2) result 데이터로 저장
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
