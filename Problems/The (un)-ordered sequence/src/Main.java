import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        long countIncrease = 0;
        long countDecrease = 0;
        long countIterations = 0;

        while (num2 != 0) {

            if( num1 >= num2 ) {
                countDecrease += 1;
            }
            if( num2 >= num1 ){
                countIncrease += 1;
            }
            countIterations += 1;

            num1 = num2;
            num2 = scan.nextInt();
        }

        if ((countIterations == countIncrease) || (countIterations == countDecrease)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
