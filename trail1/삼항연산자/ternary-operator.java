import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String a;

        a = score == 100 ? "pass" : "failure";

        System.out.println(a);
    }
}