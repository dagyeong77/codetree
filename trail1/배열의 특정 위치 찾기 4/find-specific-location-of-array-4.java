import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int sum = 0;

        for(int i=0; i<10; i++) {
            if(arr[i] == 0) {
                break;
            }
            if(arr[i] % 2 == 0) {
                cnt++;
                sum += arr[i];
            }
        }
        System.out.printf("%d " + "%d", cnt, sum);
    }
}