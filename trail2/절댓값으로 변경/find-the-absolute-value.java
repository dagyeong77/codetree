import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine()); 
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
        }
        
        abs(arr);
        
        for(int i=0; i<N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    static void abs(int[] arr) {
        for(int i=0; i<N; i++) {
            if(arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
        }
    }
}