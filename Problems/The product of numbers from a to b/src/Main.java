import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        long num3 = 1;

        for (int i = num1; i < num2; i++) {
            num3 = num3 * i;
        }

        System.out.println(num3);
    }
}