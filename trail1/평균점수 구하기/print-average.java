import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int student = 8;
        double arr[] = new double[8];

        double sum = 0;

        for(int i=0; i<8; i++) {
            arr[i] = sc.nextDouble();
        }
        for(int i=0; i<8; i++) {
            sum += arr[i];
        }

        double mean = sum/8;

        System.out.printf("%.1f" ,mean);
    }
}