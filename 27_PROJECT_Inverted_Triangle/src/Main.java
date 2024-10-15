import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter any number:");
        int num = scan.nextInt();

        int der = (num * 2) + 1;

        for (int j = der; j >= 1; j--) {


            for (int k = der; k > j; k--) {
                System.out.print("  ");
            }

            for (int i = 1; i <= j; i++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
