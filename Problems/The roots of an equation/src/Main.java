import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        int answer = 0;

        for (int i = 0; i < 1000; i++) {

            int equation = (num1 * i * i * i) + (num2 * i * i) + (num3 * i) + num4;

            if ( equation == 0) {
                System.out.println(i);
            }
        }
    }
}