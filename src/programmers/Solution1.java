package programmers;

public class Solution1 { // 문자열 섞기
    public String Solution1(String my_string, String overwrite_string, int s) {

        // 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
        // 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을
        // return 하는 solution 함수를 작성해 주세요.

        int length = overwrite_string.length();
        // (0,s) , (overwrite), (s length2 -s+length)
        // substring -> 설정한 값 사이의 문자열을 반환, 값을 하나만 설정하면 설정한 인덱스 값부터 문자열 끝까지를 반환.

        String first = my_string.substring(0,s);
        String second = overwrite_string;
        String third = my_string.substring(s+length);
        String answer = first + second + third;

        return answer;





    }
}
