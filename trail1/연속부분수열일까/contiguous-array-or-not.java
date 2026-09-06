import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arrA = new int[100];
        int[] arrB = new int[100];

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i=0; i<n1; i++) {
            arrA[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++) {
            arrB[i] = sc.nextInt();
        }

        for(int i=0; i<n1; i++) {
            boolean success = true;

            for(int j=0; j<n2; j++) {
                if(i+j >= n1) {
                    success = false;
                    break;
                }
                if(arrA[i+j] != arrB[j]) {
                    success = false;
                    break;
                }
            }
            if(success) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}