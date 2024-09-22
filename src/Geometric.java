import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        int a = sc.nextInt();
        int n = sc.nextInt();

        double s = a * (Math.pow(R, n) - 1) / (R - 1);
        System.out.println(s);
    }
}
