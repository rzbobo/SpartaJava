package chapter2.clazz;

public class Main {
    public static void main(String[] args) {

        /* Class 설명 예제
        // 객체 생성
        Person personA = new Person("홍길동", 20, "서울");
        Person personB = new Person("아무개", 21, "대구");


        // 속성에 직접 접근
        System.out.println("설정 전 personA 이름 :" + personA.name);
        System.out.println("설정 전 personB 이름 :" + personB.name);
        personA.name = "홍길동";
        personB.name = "아무개";


        /*
        System.out.println("personA 이름 :" + personA.name);
        System.out.println("personB 이름 :" + personB.name);

        // 메서드 불러오기

        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 3);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        */


    // Car Class 생성 실습
        Car car1 = new Car("현대","소나타", "D", 0);
        Car car2 = new Car("기아","모닝", "D", 0);

        car1.info();
        car2.info();
        car1.drive();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.speedCheck();
        car1.brake();
        car1.speedCheck();
        car2.drive();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.speedCheck();
        car2.brake();
        car2.speedCheck();



    }
}
