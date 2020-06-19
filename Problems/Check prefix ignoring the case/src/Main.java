import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.next().toLowerCase();

        System.out.println(text.startsWith("j"));
    }
}