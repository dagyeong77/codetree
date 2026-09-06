import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[100];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<Q; i++) {
            int qType = sc.nextInt();

            if(qType == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);

            } else if(qType == 2) {
                int b = sc.nextInt();
                int idx = -1;

                for(int j=0; j<N; j++) {
                    if(arr[j] == b) {
                        idx = j;
                        break;
                    }
                }
                System.out.println(idx + 1);

            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int j=s-1; j<e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}