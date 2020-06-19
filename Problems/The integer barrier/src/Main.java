import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int answer = 0;

        while (num1 != 0){
            answer += num1;

            num1 = scan.nextInt();

            if (answer >= 1000) {
                answer = answer - 1000;
                System.out.println(answer);
                break;
            }

            if (num1 == 0) {
                System.out.println(answer);
                break;
            }
        }
    }
}