package chapter1;

public class Condition {
    public static void main(String[] args) {

        int customers = 5;

        for (int i = 1; i < customers; i++) {
            if (i == 4) {
                break; // 반복을 벗어난다.
            }
            if (i == 2){
                continue; // 스킵한다.
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
        System.out.println("반복문이 종료되었습니다.");

        while (0 < customers) {
            System.out.println("안녕히 가세요. "+ customers +"번째 손님!");
             customers--;

        }
    }

}
