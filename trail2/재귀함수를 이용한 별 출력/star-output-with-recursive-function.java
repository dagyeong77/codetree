import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        star(N);
        
    }
    
    static void star(int n) {
        if(n == 0) {
            return;
        }
        
        star(n - 1);
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
