import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean decimal = true;

        if (N<=1) {
            decimal = false;
        } else {
            for (int i=2; i<N; i++) {
                if (N % i == 0) {
                    decimal = false;
                    break;
                }
            }
        }

        if (decimal) {
            System.out.println('P');
        } else {
            System.out.println('C');
        }
    }
}