import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text1 = scan.nextLine();
        String newText1 = text1.replace(" ","");

        String text2 = scan.nextLine();
        String newText2 = text2.replace(" ","");

       System.out.println(newText1.equals(newText2));
    }
}