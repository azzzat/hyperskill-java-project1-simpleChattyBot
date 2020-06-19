import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        boolean cond1 = (num > -15) && ( num <= 12);
        boolean cond2 = (num > 14) && ( num < 17);
        boolean cond3 = (num >= 19);

        if (cond1 || cond2 || cond3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}