import java.util.Scanner;

public class BreakCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        System.out.println("amount: "+amount);

        int coin10 = (amount - (amount % 10)) / 10;
        System.out.println("10-dollar coin(s): "+ coin10);
        amount = amount % 10;
        int coin5 = (amount - (amount % 5)) / 5;
        System.out.println("5-dollar coin(s): "+coin5);
        amount = amount % 5;
        int coin2 = (amount - (amount % 2)) / 2;
        System.out.println("2-dollar coin(s): "+coin2);
        amount = amount % 2;
        int coin1 = amount % 1;
        System.out.println("1-dollar coin(s): "+coin1);

    }
}
