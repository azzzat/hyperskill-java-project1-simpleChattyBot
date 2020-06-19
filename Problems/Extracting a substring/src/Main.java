import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        String resultText = text.substring(num1, num2+1);
        System.out.println(resultText);
    }
}