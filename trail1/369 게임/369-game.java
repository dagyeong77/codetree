import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            boolean check = false;

            if (i % 3 == 0) {
                check = true;
            }

            int num = i;

            while (num > 0) {
                int last = num % 10;
                if (last == 3 || last == 6 || last == 9) {
                    check = true;
                    break;
                } 
                num /= 10;
            }
            if (check) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}