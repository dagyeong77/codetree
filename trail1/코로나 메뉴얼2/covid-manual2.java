import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //진료소에 보내지는 인원 수 세기 
        int[] hos = new int[4];

        //3명의 환자 상태 하나씩 검사 
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine()); // st = ["Y". "38"]
            String tempString = st.nextToken(); // tempString = "Y"
            char cold = tempString.charAt(0);   // cold = 'Y'
            //char cold = st.nextToken().charAt(0);

            int temp = Integer.parseInt(st.nextToken());
 
            //감기 증상이 있는 경우 
            if(cold == 'Y') {
                //체온 구분 
                if(temp >= 37) {
                    hos[0]++;
                } else {
                    hos[2]++;
                }
            //감기 증상이 없는 경우 
            } else {
                if(temp >= 37) {
                    hos[1]++;
                } else {
                    hos[3]++;
                }
            }
        }

        //반복문으로 진료소에 보내지는 인원 출력 
        for(int i=0; i<4; i++) {
            System.out.print(hos[i] + " ");
        }

        //위급상황인 경우 
        if(hos[0] >= 2) {
            System.out.print('E');
        }
    }
}