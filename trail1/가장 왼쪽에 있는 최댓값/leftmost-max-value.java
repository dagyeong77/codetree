import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        //원소의 개수 n을 입력받음 
        int n = Integer.parseInt(br.readLine());
        
        //원소를 입력받을 배열 
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            //원소를 토큰 단위로 쪼개어 입력받음 
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //최댓값을 저장할 변수
        int max = 0; 
        //최댓값의 위치를 저장할 변수 
        int maxIdx = 0;

        while(true) {
            max = 0; 
            for(int i=0; i<n; i++) {
                //최댓값을 구함 
                if(arr[i] > max) {
                    max = arr[i];
                    maxIdx = i;
                }
            }
            int temp = maxIdx + 1;
            System.out.print(temp + " ");
            n = maxIdx;

            if(maxIdx == 0) {
                break;
            }
        }

        
        
    }
}