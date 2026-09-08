import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] map = new int[4][4];

        for(int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = 0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<i+1; j++) {
                sum += map[i][j];
            }
        }
        System.out.println(sum);
    }
}