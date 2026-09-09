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
        
        int count = 0;
        for(int i=A; i<=B; i++) {
            count += checkALL(i);
        }
        System.out.println(count);
    }
    
    //숫자에 3, 6, 9 들어있는지 판별하는 함수 
    static boolean check369(int n) {
        while(true) {
            if(n == 0) {
                return false;
            }
            int temp = n % 10;
            if(temp == 3 || temp == 6 || temp == 9) {
                return true;
            }
            n = n / 10;
        }
    }
    
    //수가 3의 배수인지 판별하는 함수 
    static boolean multiThree(int n) {
        if(n % 3 == 0) {
            return true;
        }
        else {
            return false; 
        }
    }
    
    static int checkALL(int n) {
        if(check369(n) || multiThree(n)) {
            return 1;
        }
        return 0;
    }
} 
