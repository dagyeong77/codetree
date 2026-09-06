import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(j%2==0) {
                    if(i==0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(i<=j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}