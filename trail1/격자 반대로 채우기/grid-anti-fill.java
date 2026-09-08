import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] map = new int[N][N];
        
        //시작 위치의 정수는 1 
        int start = 1;
        //열이 오른쪽에서 왼쪽으로 이동함 
        for(int i=N-1; i>=0; i--) {
            if(N%2==0) {
                if(i%2==1) {
                    for(int j=N-1; j>=0; j--) {
                        map[j][i] = start;
                        start++;
                    }
                } else {
                    for(int j=0; j<N; j++) {
                        map[j][i] = start;
                        start++; 
                    }
                }
            } else {
                if(i%2==0) {
                    for(int j=N-1; j>=0; j--) {
                        map[j][i] = start;
                        start++;
                    }
                } else {
                    for(int j=0; j<N; j++) {
                        map[j][i] = start;
                        start++; 
                    }
                }
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
