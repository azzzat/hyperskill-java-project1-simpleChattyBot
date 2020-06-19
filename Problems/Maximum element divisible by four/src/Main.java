import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();

        int answer = 0;

        for (int i = 0; i < quant; i++) {
            int number = scan.nextInt();

            if ((number % 4 == 0) && answer < number) {
                answer = number;
            }
        }

        System.out.println(answer);
    }
}