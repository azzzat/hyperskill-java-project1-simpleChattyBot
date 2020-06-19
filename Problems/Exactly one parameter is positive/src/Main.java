import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean num1 = scanner.nextInt() > 0;
        boolean num2 = scanner.nextInt() > 0;
        boolean num3 = scanner.nextInt() > 0;

        boolean answer = (!num1 && !num2 && num3) || (!num1 && num2 && !num3) || (num1 && !num2 && !num3);

        System.out.println(answer);
    }
}