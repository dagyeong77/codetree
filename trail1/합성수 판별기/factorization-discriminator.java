import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean composite = false;

        for(int i=2; i<N; i++) {
            if(N % i == 0) {
                composite = true; 
            }
        }
        if (composite == true) {
            System.out.println('C');
        } else {
            System.out.println('N');
        }
    }
}