import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();

        boolean case1 = (boy1 >= boy2) && (boy2 >= boy3);
        boolean case2 = (boy3 >= boy2) && (boy2 >= boy1);

        boolean answer = case1 || case2;

        System.out.println(answer);
    }
}