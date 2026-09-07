import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        //2행 4열 배열 생성 
        int[][] arr = new int[2][4];

        for(int i=0; i<2; i++) {
            //각 행을 한 줄씩 입력받음 
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum;

        //각 행의 평균 출력 
        for(int i=0; i<2; i++) {
            //새로운 행을 계산할 때마다 합을 0으로 초기화 
            sum = 0; 
            for(int j=0; j<4; j++) {
                sum += arr[i][j];
            } 
            System.out.printf("%.1f ", (double)sum/4);
        }System.out.println();

        //각 열의 평균 출력 
        for(int i=0; i<4; i++) {
            //새로운 열을 계산할 때마다 합을 0으로 초기화 
            sum = 0;
            for(int j=0; j<2; j++) {
                sum += arr[j][i];
            }
            System.out.printf("%.1f ", (double)sum/2);
        }System.out.println();

        //전체 평균 구하기 위해 0으로 초기화 
        sum = 0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                sum += arr[i][j];
            }
        }
        System.out.printf("%.1f", (double)sum/8);
    }
}