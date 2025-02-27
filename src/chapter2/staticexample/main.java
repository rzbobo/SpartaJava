package chapter2.staticexample;

public class main {
    public static void main(String[] args) {

        // 클래스 멤버
        // static 변수, 메서드 활용
        System.out.println("static 변수 :" + Person.population);
        Person.printPopulation();

        // 인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "gygim";
        p2.name = "Steve";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();


    }
}
