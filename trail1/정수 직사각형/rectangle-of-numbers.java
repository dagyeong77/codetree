import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[N][M];
        
        int a = 1; 
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                map[i][j] = a;
                a = a + 1;
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
