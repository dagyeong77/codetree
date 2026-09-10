import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static String A;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        A = br.readLine();
        
        boolean test = check(A);
        
        if(test) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    //문자열에 서로 다른 알파벳이 2개 이상인지 판별하는 함수 
    static boolean check(String a) {
        //문자열이 한 자릿수이면 false 
        if(a.length() == 1) {
            return false; 
        }
        //첫번째 알파벳을 꺼냄 
        char c = a.charAt(0);
        //두번째 알파벳부터 검사하는데, 첫번째 알파벳과 하나라도 다르면 true 
        for(int i=1; i<A.length(); i++) {
            if(a.charAt(i) != c) {
                return true;
            }
        }
        //끝까지 다 검사했는데 모두 첫번째 알파벳과 같으면 false 
        return false;
    }
}