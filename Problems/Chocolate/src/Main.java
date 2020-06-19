import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        boolean case1 = (k % m) == 0;
        boolean case2 = (k % n) == 0;
        boolean case3 = (n * m) > k;

        if (case3 && (case1 || case2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}