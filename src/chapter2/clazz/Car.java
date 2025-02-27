package chapter2.clazz;

public class Car {
    // 1. 속성
    String manufacturer; // 제조 회사
    String name; // 차 이름
    String color; // 차 색깔
    String size; // 대형 중형 소형
    String gear; // 기어
    int speed; // 속도

    // 2. 생성자
    Car(String manufacturer, String name, String gear, int speed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.gear = gear;
        this.speed = speed;
    }

    // 4. 메서드
    // 자동차의 정보
    void info() {
        System.out.println("자동차의 정보를 말씀드리겠습니다.");
        System.out.println("해당 자동차의 제조회사는 "+ manufacturer + "입니다.");
        System.out.println("해당 자동차의 이름은 "+ name + "입니다.");
        System.out.println("해당 자동차의 현재 속도는 "+ speed + "km입니다.");
        System.out.println("해당 자동차의 현재 기어 상태는 "+ gear + "입니다.");
    }
    // 주행 시작
    void drive() {
        System.out.println("주행을 시작합니다.");
    }
    // 가속
    void accelerate() {
        System.out.println("속도를 10km만큼 올립니다.");
        speed += 10;
    }
    // 속도 확인
    void speedCheck() {
        System.out.println(manufacturer+" "+name+"차의 "+"현재 속도는 "+speed+ "km입니다.") ;
    }
    void brake() {
        System.out.println("브레이크를 밟습니다.");
        System.out.println("속도가 10km만큼 줄어듭니다.");
        speed -= 10;
    }

}
