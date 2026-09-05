import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;
        double mean = 0;

        for (int i=1; i<=N; i++) {
            int num = sc.nextInt();

            sum += num;
        }

        mean = (double)sum / N;

        System.out.printf("%d" + " " + "%.1f", sum, mean);
    }
}