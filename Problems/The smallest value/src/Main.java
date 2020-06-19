import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long inputNumber = scan.nextLong();

        long numberCheck = 1;
        long answerNumber = 0;

        while(inputNumber >= numberCheck) {
            answerNumber += 1;
            numberCheck *= answerNumber;
        }

        System.out.println(answerNumber);
    }
}