import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        double a1 = a;
        double b1 = b;

        if (b != 0){
            a1 = a1 / b1;
        }

        return a1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}