import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //a를 b로 나눈 나머지들이 등장한 횟수 세기
        int[] arr = new int[b];

        while (true) {

            //a가 1이하가 되면 종료
            if (a <= 1) {
                break;
            }

            //나머지 저장할 변수
            int temp;

            //a를 b로 나눈 나머지
            temp = a % b;

            //나머지가 나온 횟수 증가
            arr[temp]++;

            //a를 b로 나눈 몫으로 갱신
            a = a / b;
        }

        int sum = 0;

        //나머지가 나온 횟수의 제곱의 합
        for (int i = 0; i < b; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println(sum);
    }
}
