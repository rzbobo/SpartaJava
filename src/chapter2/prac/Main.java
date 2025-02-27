package chapter2.prac;

public class Main {
    public static void main(String[] args) {
        // 자판기 : 음료, 가격, 잔액, 지불 방식
        VendingMachine vendingMachine = new VendingMachine("포카리스웨트",1000,5000, "카드");
        vendingMachine.chargeDrink();
        vendingMachine.pay();
        vendingMachine.showMenu();
        vendingMachine.select();

    }
}
