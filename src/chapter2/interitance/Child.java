package chapter2.interitance;

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("자식 생성자");
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }

}
