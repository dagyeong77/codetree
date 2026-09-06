import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double arr[] = new double[n];
        double sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }
        
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }

        double mean = sum/n;

        System.out.printf("%.1f\n", mean);

        if(mean >= 4.0) {
            System.out.println("Perfect");
        } else if(mean >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}