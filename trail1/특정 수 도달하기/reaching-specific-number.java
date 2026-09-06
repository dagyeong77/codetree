import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;
        int count = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++) {
            if(arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            count++;
        }
        double mean = (double)sum/count;

        System.out.printf("%d %.1f", sum, mean);
    }
}