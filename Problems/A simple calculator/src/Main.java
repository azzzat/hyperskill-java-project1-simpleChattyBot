import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num1 = scan.nextLong();
        String operation = scan.next();
        long num2 = scan.nextLong();
        int result;

        switch(operation){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                if (num2 == 0L) {
                    System.out.println("Division by 0!");
                } else {
                    double doubleNum1 = (double) num1;
                    double doubleNum2 = (double) num2;
                    result = (int) (doubleNum1 / doubleNum2); // тут не сразу допер
                    System.out.println(result);
                }
                break;
            case "*":

                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}