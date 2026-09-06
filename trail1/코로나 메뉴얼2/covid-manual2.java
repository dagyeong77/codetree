import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[5];
        int type = 0;
        char s;
        int temp;

        for(int i=0; i<3; i++) {
            s = sc.next().charAt(0);
            temp = sc.nextInt();

            if(s == 'Y' && temp >= 37) {
                type = 1;
            } else if(temp >= 37) {
                type = 2;
            } else if(s == 'Y') {
                type = 3;
            } else {
                type = 4;
            }
            countArr[type]++;
        }
        for(int i=1; i<=4; i++) {
            System.out.print(countArr[i] + " ");
        }
        if(countArr[1] >= 2) {
            System.out.println("E");
        }
    }
}