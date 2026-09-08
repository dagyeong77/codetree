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
        
        int[][] map1 = new int[N][M]; 
        int[][] map2 = new int[N][M]; 
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] newMap = new int[N][M];
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map1[i][j] == map2[i][j]) {
                    newMap[i][j] = 0;
                } else {
                    newMap[i][j] = 1;
                }
                System.out.print(newMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
