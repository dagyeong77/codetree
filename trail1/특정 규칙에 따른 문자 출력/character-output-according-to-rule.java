import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            for(int space=0; space<N-i-1; space++) {
                System.out.print("  ");
            }
            for(int symbol=0; symbol<=i; symbol++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
        for(int i=N-2; i>=0; i--) {
            for(int symbol=0; symbol<=i; symbol++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}