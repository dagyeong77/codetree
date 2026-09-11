import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static int N;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        numPrint1(N);
        System.out.println();
        numPrint2(N);
        
    }
    
    static void numPrint1(int N) {
        if(N == 0) {
            return; 
        }
        numPrint1(N-1);
        System.out.print(N + " ");
    }
    
    static void numPrint2(int N) {
        if(N == 0) {
            return;
        }
        System.out.print(N + " ");
        numPrint2(N-1);
    }
}