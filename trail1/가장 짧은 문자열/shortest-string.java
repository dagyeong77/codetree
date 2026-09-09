import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = 3;
        
        String[] arr = new String[N];
        
        int max = 0;
        int min = Integer.MAX_VALUE; 
        
        for(int i=0; i<N; i++) {
            arr[i] = br.readLine(); 
        }
        
        for(int i=0; i<N; i++) {
            if(arr[i].length() > max) {
                max = arr[i].length();
            } 
            if(arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        System.out.println(max-min);
    }
}