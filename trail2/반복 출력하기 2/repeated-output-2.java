import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int N = Integer.parseInt(br.readLine());
        
        printH(N);
        
    }
    
    static void printH(int n) {
        if(n == 0) {
            return;
        }
            printH(n - 1);
            System.out.println("HelloWorld");
    }
}