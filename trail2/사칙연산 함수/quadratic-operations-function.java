import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char o = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());
        
        int result = 0;
        //String not = "";
        boolean check = true;
        if(o == '+') {
            result = plus(a, c);
        } else if(o == '-' ) {
            result = sub(a, c);
        } else if(o == '/') {
            result = divide(a, c);
        } else if(o == '*') {
            result = multi(a, c);
        } else {
            //not = "False";
            check = false;
        }
        
        
        if(check) {
            System.out.printf("%d %c %d = %d", a,o,c,result);
        }
        else {
            
            System.out.println("False");
            
        }
        
    }
    
    
    static int plus(int a, int c) {
        return a + c;
    }
    
    static int sub(int a, int c) {
        return a - c;
    }
    
    static int divide(int a, int c) {
        return a / c;
    }
    
    static int multi(int a, int c) {
        return a * c;
    }

}

