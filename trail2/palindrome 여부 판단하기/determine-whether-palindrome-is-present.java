import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static String A;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        A = br.readLine();
        
        if(str(A)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
    
    //문자열이 팰린드롬인지 판별하는 함수 
    static boolean str(String a) {
        
        //문자열의 길이가 1이면 true
        //생략 가능.?
        if(a.length() == 1) {
            return true;
        }
        
        //왼쪽 문자부터 검사 
        int left = 0;
        //오른쪽 문자부터 검사 
        int right = a.length() - 1;
        
        //왼쪽이 오른쪽보다 작은 동안 반복 
        while(left < right) {
            //왼쪽의 문자열이 오른쪽의 문자열과 하나라도 같지 않으면 false
            if(a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--; 
        }
        return true;
    }
}