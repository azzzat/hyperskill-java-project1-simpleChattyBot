import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();

        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        for (int i = 1; i <= quant; i++){
            int part = scan.nextInt();
            if (part == 0) {
                perfect += 1;
            } else if (part == 1) {
                larger += 1;
            } else if (part == -1){
                smaller += 1;
            }
        }

        String answer = perfect + " " + larger + " " + smaller;

        System.out.println(answer);
    }
}