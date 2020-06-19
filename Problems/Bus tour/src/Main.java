import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int busHeight = scan.nextInt();
        int quantOfBridges = scan.nextInt();

        for (int i = 1; i <= quantOfBridges; i++) {
            int bridgeHeight = scan.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == quantOfBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}