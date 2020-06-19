import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int length = 0;

        while (number != 0) {
            length += 1;
            number = scan.nextInt();
        }
        
        System.out.println(length);
    }
}