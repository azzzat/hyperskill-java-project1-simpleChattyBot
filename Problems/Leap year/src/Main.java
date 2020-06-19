import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        boolean case1 = (year % 4) == 0;
        boolean case2 = (year % 100) != 0;
        boolean case3 = (year % 400) == 0;

        if (case1 && (case2 || case3)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

    }
}