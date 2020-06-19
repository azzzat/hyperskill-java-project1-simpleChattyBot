import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();
        int count = 0;
        long number;
        long answer = 0;

        while (count < quant) {
            number = scan.nextInt();
            if ((number % 4 == 0) && (number > answer)) {
                answer = number;
            }
            count++;
        }
        System.out.println(answer);
    }
}