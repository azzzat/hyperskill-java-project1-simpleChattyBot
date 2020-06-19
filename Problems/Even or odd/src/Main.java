import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        while (number != 0){
            if (number % 2 == 0) {
                System.out.println("even");
            } else if (number % 2 != 0) {
                System.out.println("odd");
            }
            number = scan.nextInt();
        }
    }
}