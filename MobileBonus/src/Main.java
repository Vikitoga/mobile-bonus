public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addMoney = 1100;
        int bonus;
        int total;

        if (addMoney > 1000) {
            bonus = addMoney / 100 * 1;
        } else {
            bonus = 0;
        }
        total = balance + addMoney + bonus;
        System.out.println("Ваш баланс - " + total + " руб.");
        System.out.println("Начисленно бонусов - " + bonus + " руб.");

    }
}
