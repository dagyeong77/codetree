import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    //수열 A의 크기 N
    static int N;
    
    //정수 M 
    static int M; 
    
    //수열 A
    static int[] A;
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        A = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(oddEven(M));
        
    }
    
    //M이 홀수면 1을 빼고 짝수면 2를 나누고
    //모든 M에 대한 A의 M번째 원소를 더하는 함수 
    
    //M이 4일 때 예시
    static int oddEven(int M) {
        int sum = A[M-1]; // 2 넣고 시작 A[3]
        while(M != 1) {
            if(M % 2 == 1) {
                M -= 1;
                sum += A[M-1];
            }
            else { // 처음에 M은 4니까 여기서 2가 됨
                // M은 2니까 여기 한번 더
                M /= 2; // M = 1됨
                sum += A[M-1]; // 2에 A[1]인 4 더함 -> sum은 6
                // sum에 A[0]인 5 더함 -> sum은 11
            }
        }
        // M이 1이 되었으므로 반복 탈출
        return sum;
    }    
}
