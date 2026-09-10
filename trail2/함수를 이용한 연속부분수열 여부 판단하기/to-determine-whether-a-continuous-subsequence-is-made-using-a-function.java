import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int n1;
    static int n2; 
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        
        int[] A = new int[n1];
        int[] B = new int[n2];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        if(sequence(A, B)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    static boolean sequence(int[] A, int[] B){
        //i는 A를 어디에서부터 비교할지 그 시작 위치 
        for(int i=0; i<=n1 - n2; i++) {
            
            boolean match = true;
            
            //j는 B의 몇 번째 원소를 비교하는지 
            for(int j=0; j<n2; j++) {
                if(A[i+j] != B[j]) {
                    match = false;
                    break;
                }
            }
            
            //비교했을 때 다른 원소가 하나도 없었다면 true 
            if(match) {
                return true; 
            }
        }
        
        //모든 시작 위치에서 달랐다면 false 
        return false;
    }
}