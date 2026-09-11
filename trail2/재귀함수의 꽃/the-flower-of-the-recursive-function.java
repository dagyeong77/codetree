import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        decreaseIncrease(N);
    }
    
    static void decreaseIncrease(int n) {
        if(n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        decreaseIncrease(n-1);
        System.out.print(n + " ");
    }
}