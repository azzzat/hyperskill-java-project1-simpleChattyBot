import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int digit12 = number / 100;
        int digit34 = number % 100;

        int digit3 = digit34 / 10;
        int digit4 = digit34 % 10;

        int digit34reverse = digit4 * 10 + digit3;

        if (digit12 == digit34reverse) {
            System.out.println(1);
        } else {
            System.out.println(56);
        }

    }
}