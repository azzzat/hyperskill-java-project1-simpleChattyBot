import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean wkend = scanner.nextBoolean();

        boolean case1 = !wkend && cups >= 10 && cups <= 20;
        boolean case2 = wkend && cups >= 15 && cups <= 25;

        boolean answer = case1 || case2;

        System.out.println(answer);
    }
}