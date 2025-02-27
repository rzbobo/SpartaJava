package chapter2.staticex;

public class Student {
    static String name; // ⚠️ 모든 객체가 동일한 name을 공유 (위험)

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("이름: " + name);
    }


}