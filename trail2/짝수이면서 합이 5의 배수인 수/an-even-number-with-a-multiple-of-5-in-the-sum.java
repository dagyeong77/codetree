import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(check(n));
    }
    
    
    static String check(int n) {
        if(n % 2 == 0) {
            if(((n / 10) + (n % 10)) % 5 == 0) {
                return "Yes";
            }
            else {
                return "No";
            }
        } 
        else {
            return "No";
        }
    }
}
