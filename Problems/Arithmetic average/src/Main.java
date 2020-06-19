import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int count = 0;
        int summ = 0;

        for (int i = number1; i <= number2; i++) {
            if ((i % 3) == 0) {
                count += 1;
                summ += i;
            }
        }

        double answer = 1.0 * summ / count;

        System.out.println(answer);
    }
}