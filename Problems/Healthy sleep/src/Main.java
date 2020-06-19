import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourA = scan.nextInt();
        int hourB = scan.nextInt();
        int hourH = scan.nextInt();

        if (hourH >= hourA && hourH <= hourB) {
            System.out.println("Normal");
        } else if (hourH < hourA) {
            System.out.println("Deficiency");
        } else if (hourH > hourB) {
            System.out.println("Excess");
        }
    }
}