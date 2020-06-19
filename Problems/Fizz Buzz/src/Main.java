import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            if ((i % 3) == 0 && (i % 5) == 0){
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}