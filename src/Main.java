public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int add = 300;
        int formula = 100;
        int bonus = 0;
        if (add > 1000) {
            bonus = add / formula;
        }
        balance = balance + add + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}