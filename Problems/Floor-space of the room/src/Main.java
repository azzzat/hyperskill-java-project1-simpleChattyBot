import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shape = scan.next();
        double area = 0;

        switch(shape){
            case "triangle":
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle":
                double ar = scan.nextDouble();
                double br = scan.nextDouble();
                area = ar * br;
                break;
            case "circle":
                double r = scan.nextDouble();
                area = 3.14 * r * r;
                break;
        }
        System.out.println(area);
    }
}