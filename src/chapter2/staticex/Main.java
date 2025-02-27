package chapter2.staticex;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("gygim");
        Student s2 = new Student("Steve");

        s1.printName();  // ⚠️ "이름: Steve"
        s2.printName();  // ⚠️ "이름: Steve"
    }
}