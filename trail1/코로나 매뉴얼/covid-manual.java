import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = 0;

        for (int i=0; i<3; i++) {
            char c = sc.next().charAt(0);

            int t = sc.nextInt();

            if(c == 'Y' && t >= 37) {
                A++;
            }
        }

        if (A >= 2) {
            System.out.println('E');
        } else {
            System.out.println('N');
        }
    }
}