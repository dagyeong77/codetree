import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[100];

        int max1 = 0;
        int max2 = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
             max1 = arr[1];
             max2 = arr[0];
        }
        for(int i=2; i<N; i++) {
            if(arr[i] >= max1) {
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}