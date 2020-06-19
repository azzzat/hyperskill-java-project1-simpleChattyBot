import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = scan.nextDouble();
        double percent = scan.nextDouble();
        double exit = scan.nextDouble();
        int result = 0;

        while(money < exit) {
            money *= (1+(percent/100));
            result++;
        }
        System.out.println(result);
    }
}