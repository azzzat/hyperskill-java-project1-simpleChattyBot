import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int answer = 0;

        while (number != 0) {
            answer += number;
            number = scan.nextInt();
        }

        System.out.println(answer);
    }
}