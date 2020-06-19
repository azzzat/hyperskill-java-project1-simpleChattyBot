import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        boolean case1 = (x1 == x2);
        boolean case2 = (y1 == y2);
        boolean case3 = (x1 + x2) == (y1 + y2);
        boolean case4 = (x1 + y1) == (x2 + y2);
        boolean case5 = (x1 + y2) == (x2 + y1);

        if (case1 || case2 || case3 || case4 || case5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}