import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int count = 0;

        for (int i = num1; i <= num2; i++){
            if (i % num3 == 0) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}