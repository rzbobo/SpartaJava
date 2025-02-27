package chapter1;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 숫자형 배열 선언
        int[] arr = {1, 2, 3, 4, 5};
        /*
        System.out.println("배열의 첫 번째 요소 : " + arr[0]);
        System.out.println("배열의 두 번째 요소 : " + arr[1]);
        System.out.println("배열의 세 번째 요소 : " + arr[2]);
        System.out.println("배열의 네 번째 요소 : " + arr[3]);
         */

        // 반복문 활용
        for (int i = 0; i < arr.length; i++) {
            // i = 0;
            // i = 1;
            // i = 2;
            // i = 3;
            // i = 4;
            System.out.println("배열의 " + (i + 1) + "번째 요소 : " + arr[i]);
        }

        // 향상된 for문 활용
        // 현업에서 훨씬 더 많이 사용하므로 이 방식에 더 익숙해져야 한다.
        // 배열을 활용하는 향상된 for문
        // for (자료형 변수명 : 배열명) {
        //     실행문;
        // }
        for (int a : arr) {
            System.out.println("값 : " + a);
        }

        //2차원 배열
//        boolean[] [] board = new boolean[2][3];
        // [] [] []
        // [] [] []
        // 세로, 가로 순서로 읽으면 편하다
        boolean[][] board = {
                {true, false},
                {false, true},
        };
        System.out.println(board[0][1]);
        System.out.println(board[1][0]);



        /*

        // 문자형 배열 선언
        String[] stringArr = new String[5];

        // 논리형 배열 선언
        boolean[] booleansArr = new boolean[5];

        // 문자형 배열 입력하기
        String[] arrSc = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(arrSc));


        */
    }
}
