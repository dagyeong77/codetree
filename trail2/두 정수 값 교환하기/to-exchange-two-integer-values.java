import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static class Swap {
        int a;
        
        Swap(){}
        
        Swap(int a) {
            this.a = a;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Swap num = new Swap(n);
        Swap num2 = new Swap(m);
        
        swap(num, num2);
        
        System.out.println(num.a + " " + num2.a);
        
        
    }
    
    static void swap(Swap n, Swap m) {
        int temp = n.a;
        n.a = m.a;
        m.a = temp;
    }
}