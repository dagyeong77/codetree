import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        //십의자리 숫자 개수를 담을 배열 
        int[] counts = new int[9];
 
        st = new StringTokenizer(br.readLine());
        
        //0이 언제 주어질지 모름 = 반복을 수행할 정확한 횟수를 모름
        while (true) {
            
            //st에서 하나씩 꺼낸 값 
            int num = Integer.parseInt(st.nextToken());
            
            //0이 주어지면 반복문을 종료 
            if(num == 0){
                break;
            }

            //정수가 한자리 숫자이면 건너뜀 
            if(num < 10){
                continue; 
            }

            //십의 자리 숫자를 추출 
            int ten = num / 10;

            //십의 자리 숫자가 각각 몇 개인지 개수 세기 
            //받은 숫자에 해당하는 십의 자리의 개수를 1 증가
            counts[ten - 1] = counts[ten - 1] + 1;
            // counts[ten - 1]++;
            // counts[ten - 1] += 1
        }

        //출력 
        for(int i=1; i<10; i++) {
            System.out.println(i + " - " + counts[i-1]);
        }
    }
}