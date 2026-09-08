import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];

        int start = 1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[j][i] = start;
                start++;
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        // for(int j=0; j<N; j++){
        //     for(int i=0; i<N; i++){
        //         map[i][j] = start;
        //         start++;
        //     }
        // }

    }
}