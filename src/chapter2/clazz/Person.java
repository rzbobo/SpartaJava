package chapter2.clazz;

public class Person {

    // 1. 속성 -변수 선언으로 표현할 수 있음
    String name;
    int age;
    String address;


    // 2. 생성자 - 조립설명서
    // 기본생성자 : Person() {}
    // 생성자의 특징 :
    // 1. 클래스와 이름이 같다.
    // 2. 반환 타입이 존재하지 않는다.
    // 3. 여러 개가 존재할 수 있다.
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 3. 기능 ( 메서드 부분 )
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }



}
