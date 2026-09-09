import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for(int i=A; i<=B; i++) {
            if(prime(i) && even(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    
    //n이 소수인지 판별하는 함수 
    static boolean prime(int n) {
        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //n의 모든 자릿수의 합이 짝수인지 판별하는 함수 
    static boolean even(int n) {
        if(((n/10) + (n%10)) % 2 == 0) {
            return true;
        }
        return false;
    }
} 
