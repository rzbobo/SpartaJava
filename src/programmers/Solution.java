package programmers;
import java.util.Scanner;

public class Solution { //홀짝구분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 삼항 연산자 풀이
        // System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        if (n%2 == 0) {
            System.out.println(n+" is even");
        } else {
            System.out.println(n+" is odd");
        }


    }
}
