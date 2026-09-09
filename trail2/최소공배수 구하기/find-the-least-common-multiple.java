import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        //최소공배수 구해서 출력하는 함수 호출 
        lcm(n, m);
    }
    
    //최대공약수
    static int gcd(int n, int m) {
        
        //나머지를 담을 변수 
        int remain;
        while (true) {
            
            //나머지 계산 
            remain = n % m;
            
            //나머지가 0인 경우 반복 종료 
            if(remain == 0) {
                break;
            }
            
            //나머지가 0이 아니면 n에 m을 넣음
            n = m;
            //m에 나머지를 넣음 
            m = remain;
        }
        
        //처음에 입력받은 n과 m의 최대공약수 
        return m;
    }
    
    //최소공배수 = n와 m의 곱을 최대공약수로 나눔 
    static void lcm(int n, int m) {
        System.out.println(n * m / gcd(n, m));;
        return;
    }
}
