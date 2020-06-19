import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int count = 0;


        for (int i = 1; i <= number; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == number) {
                    break;
                }
            }

            if (count == number) {
                break;
            }
        }
    }
}