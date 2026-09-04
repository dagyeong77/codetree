import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int classroom = 0;
        int hall = 0;
        int rest = 0;

        for (int i=1; i<=n; i++) {
            if (i % 12 == 0) {
                rest++;
            } else if (i % 3 == 0) {
                hall++;
            } else if (i % 2 == 0) {
                classroom++;
            }
        }
        System.out.println(classroom + " " + hall + " " + rest);
    }
}