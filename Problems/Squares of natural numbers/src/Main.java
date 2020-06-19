import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intNumber = scan.nextInt();
        int number = 1;

        while (intNumber >= (number * number)) {
            System.out.println(number * number);
            number += 1;
        }

    }
}