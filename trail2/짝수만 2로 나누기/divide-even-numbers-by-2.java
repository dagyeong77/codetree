import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    //전역 변수 N을 지정 
    static int N;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
         
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //함수 호출 
        even2(arr);
        
        for(int i=0; i<N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    //인자로 받은 배열의 각 원소를 확인해서 짝수이면 2로 나누는 함수 
    static void even2(int[] arr2) {
        for(int i=0; i<N; i++) {
            if(arr2[i] % 2 == 0) {
                arr2[i] = arr2[i] / 2;
            }
        }
    }
}