public class Main {
    public static void main(String[] args) {
        int amount1 = 200;
        int plus = 600;

        int bonus;

        int amount2;

        if (plus > 1_000) {
            bonus = plus / 100;
            System.out.println(bonus);
            amount2 = amount1 + plus + bonus;
            System.out.println(amount2);
        } else {
            amount2 = amount1 + plus;
            System.out.println(amount2);
        }

    }
}
