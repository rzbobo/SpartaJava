package chapter2.wrapper;



public class Main {
    public static void main(String[] args) {

        // 참조형 변수 확인 예제
        Person personA = new Person();
        System.out.println("personA =" + personA);
        int[] arr = {1,2,3,4,5};
        System.out.println("arr =" + arr);

        // 래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        // 참조형 변수이기도 하다.
        // Integer <- int를 감싸고 있음
        Integer num = 100;
        System.out.println("num = " + num);

        // 래퍼클래스 사용 예시
        CustomInteger customInteger = new CustomInteger(10);
        String myInteger = customInteger.toString();
        System.out.println("myInteger = " + myInteger);

        // 오토박싱 ( 기본형 -> 래퍼 )
        Integer num3 = 10;
//        Integer num3 = Integer.valueOf(10);

        // 오토언박싱 ( 래퍼 -> 기본형 )

        int num4 = num3;
        // num3.intValue();


    }

}

