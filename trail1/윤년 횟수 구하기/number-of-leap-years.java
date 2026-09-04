import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int leap = 0;

        for(int i=1; i<=N; i++) {
            if (i % 4 == 0) {
                leap++;
            }
            if (i % 100 == 0 && i % 400 != 0) {
                leap--;
            }
        }
        System.out.println(leap);
    }
}