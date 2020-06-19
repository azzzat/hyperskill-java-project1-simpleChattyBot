import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int largestNumber = 0;

        while (number != 0) {
            if (number > largestNumber) {
                largestNumber = number;
            }
            number = scan.nextInt();
        }
        System.out.println(largestNumber);
    }
}