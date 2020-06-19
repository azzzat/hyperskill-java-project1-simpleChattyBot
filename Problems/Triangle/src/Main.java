import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        boolean cond1 = (num1 + num2) > num3;
        boolean cond2 = (num1 + num3) > num2;
        boolean cond3 = (num3 + num2) > num1;

        if (cond1 && cond2 && cond3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}