import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < quant; i++) {
            int grade = scan.nextInt();

            if (grade == 5) {
                a += 1;
            } else if (grade == 4) {
                b += 1;
            } else if (grade == 3) {
                c += 1;
            } else if (grade == 2) {
                d += 1;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}