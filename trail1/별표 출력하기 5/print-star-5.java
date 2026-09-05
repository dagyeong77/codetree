import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=N; i>=1; i--) {
            for(int group=1; group<=i; group++) {
                for(int star=1; star<=i; star++) {
                    System.out.print("*");
                }
                if (group < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}