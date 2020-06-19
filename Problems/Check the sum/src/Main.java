import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isSum1 = (num1 + num2) == 20;
        boolean isSum2 = (num1 + num3) == 20;
        boolean isSum3 = (num2 + num3) == 20;

        boolean answer = isSum1 || isSum2 || isSum3;

        System.out.println(answer);
    }
}