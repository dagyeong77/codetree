import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] pascal = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<i+1; j++) {
                if(j == 0 || i == j) {
                    pascal[i][j] = 1; 
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
