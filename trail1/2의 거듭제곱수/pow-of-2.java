import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x = 0;
        int value = 1;   //2의 0제곱

        while (true) {
            if (value == N) {
                break;
            } 
            value *= 2;  //다르면 value에 2를 곱하고 다시 반복 
            x++; 
        } 
        System.out.println(x);
    }
}


//처음: value = 1, x = 0  → 1 = 2⁰

//2를 한 번 곱함
//value = 2, x = 1        → 2 = 2¹

//2를 두 번 곱함
//value = 4, x = 2        → 4 = 2²

//2를 세 번 곱함
//value = 8, x = 3        → 8 = 2³