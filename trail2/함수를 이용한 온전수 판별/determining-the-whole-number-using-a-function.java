import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int count = 0;
        for(int i=A; i<=B; i++) {
            if(perfect(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    //n이 2로 나누어 떨어지는지 판별하는 함수 
    static boolean numTwo(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false; 
        }
    }
    
    //n의 일의 자리가 5인지 판별하는 함수 
    static boolean firstFive(int n) {
        if(n % 10 == 5) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //n이 3으로는 나누어 떨어지지만 9로는 나누어 떨어지지 않는지 판별하는 함수 
    static boolean threeNotNine(int n) {
        if(n % 3 == 0) {
            if(n % 9 != 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    //n이 온전수 인지 아닌지 판별하는 함수 
    static boolean perfect(int n) {
        if(numTwo(n)) {
            return false;
        }
        else if(firstFive(n)) {
            return false;
        } 
        else if(threeNotNine(n)) {
            return false;
        }
        else {
            return true; 
        }
    }
}


