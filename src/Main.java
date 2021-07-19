public class Main {
    public static void main(String[] args) {
        int amount = 200;
        int plus = 1_001;
        int bonus;

        if (plus > 1_000) {
            bonus = plus / 100;
            System.out.println(bonus);
        } else {
            bonus = 0;
        }

        System.out.println(amount + plus + bonus);
    }
}
