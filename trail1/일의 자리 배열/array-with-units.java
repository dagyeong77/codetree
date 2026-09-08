import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 

        int[] arr = new int[11];

        st = new StringTokenizer(br.readLine());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        System.out.print(arr[1] + " " + arr[2] + " ");

        for(int i=3; i<11; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10; 
            System.out.print(arr[i] + " ");
        }
    }
}