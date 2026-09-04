import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int i = A;

        while (i <= B) {
            System.out.printf("%d ", i);

            if (i % 2 == 1) {
                i*=2;
            } else {
                i+=3;
            }
        }
    }
}