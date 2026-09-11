import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static int N;
    static int M;
    
    static String input;
    static String purpose; 
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //입력 문자열을 읽어옴 
        input = br.readLine();
        
        //목적 문자열을 읽어옴 
        purpose = br.readLine();
        
        //문자열의 길이 
        N = input.length();
        M = purpose.length();
        
        System.out.println(matched());
    }
    
    
    //idx는 입력 문자열의 시작 위치
    //idx에서 시작한 입력 문자열에서 목적 문자열이 시작하는 지 참 또는 거짓으로 판별하는 함수 
    static boolean start(int idx) {
        for(int j=0; j<M; j++) {
            if(input.charAt(idx+j) != purpose.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    
    //목적 문자열이 입력 문자열에서 등장하면, 시작 위치를 리턴하고
    //등장하지 않으면, -1을 리턴하는 함수 
    static int matched() {
        
        //i는 입력 문자열의 시작 위치 
        for(int i=0; i<N - M + 1; i++) {
            if(start(i)) {
                return i;
            }
        }
        return -1;
    }
}