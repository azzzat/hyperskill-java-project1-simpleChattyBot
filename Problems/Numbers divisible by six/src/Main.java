import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < quant; i++) {
            int number = scan.nextInt();

            if ((number % 6) == 0) {
                sum += number;
            }
        }

        System.out.println(sum);

    }
}