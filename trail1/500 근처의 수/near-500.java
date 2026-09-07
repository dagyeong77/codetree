import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[10];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxUnder = 0; 
        int minOver = Integer.MAX_VALUE; 

        for(int i=0; i<10; i++) {
            if(arr[i] < 500) {
                if(arr[i] > maxUnder) {
                    maxUnder = arr[i];
                }
            } else if(arr[i] > 500) {
                if(arr[i] < minOver) {
                    minOver = arr[i];
                }
            }
        }
        System.out.println(maxUnder + " " + minOver);
    }
}