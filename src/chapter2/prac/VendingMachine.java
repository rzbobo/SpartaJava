package chapter2.prac;

public class VendingMachine {
    // 속성
    private String drink; // 음료수
    private int price; // 가격
    private int stock = 0; // 재고
    private int balance = 0;// 잔액
    private int charge;  // 충전금액
    private String payment;// 지불방식

    // 생성자
    public VendingMachine(String drink, int price, int charge, String payment) {
        this.drink = drink;
        this.price = price;
        this.charge = charge;
        this.payment = payment; //
    }

    // 생각할 점 : 이렇게 관리하게 되면 자판기에 초기값을 설정 해야한다.
    // 초기값으로 0으로 둬야할 것은 잔액, 재고
    // 메서드에 재고 채우기를 넣는다고 가정하면 재고 또한 0으로 두는 게 맞다.
    // 재고 채우기 메서드를 작성할 때, 존재하는 음료수 종류별로 5개씩 채우기.





    // 메서드


    public void showMenu() {
        System.out.println("- 메뉴 확인 -");
        System.out.println("-------------------------");
        System.out.println("선택하신 음료수 : " + drink);
        System.out.println("가격 : " + price + "원");
        System.out.println("재고 : " + stock + "개");
        System.out.println("현재 잔액 : " + balance + "원");
        System.out.println("-------------------------");
    }

    public void select() {
        if (this.balance >= price) {
            if (this.stock > 0) {
                this.stock--;
                this.balance -= price;
                System.out.println("- 음료 구매 -");
                System.out.println("-------------------------");
                System.out.println(drink + " 구매 성공! 남은 잔액: " + this.balance + "원");
                System.out.println("-------------------------");
            } else {
                System.out.println("- 음료 구매 -");
                System.out.println("-------------------------");
                System.out.println("재고가 부족합니다.");
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("- 음료 구매 -");
            System.out.println("-------------------------");
            System.out.println("잔액이 부족합니다.");
            System.out.println("-------------------------");
        }
    }

    public void pay() {
        this.balance += charge;
        System.out.println("- 금액 충전 -");
        System.out.println("-------------------------");
        System.out.println("안녕하세요, 손님!");
        System.out.println(payment+"방식으로 충전하겠습니다!");
        System.out.println("결제 완료! 충전된 금액: " + charge + "원, 현재 잔액: " + this.balance + "원");
        System.out.println("-------------------------");
    }

    public void chargeDrink() {
        System.out.println("- 재고 관리 -");
        System.out.println("-------------------------");
        System.out.println("재고를 채우겠습니다!");
        this.stock += 5;
        System.out.println("선택하신 " + drink + "의 재고를 정상적으로 채웠습니다!");
        System.out.println(drink +" 재고 : " + stock + "개");
        System.out.println("-------------------------");

    }


    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
