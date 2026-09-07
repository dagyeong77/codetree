import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] carPrice = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            carPrice[i] = Integer.parseInt(st.nextToken());
        }

        int minCar = Integer.MAX_VALUE;
        int profit = 0; 

        for(int i=0; i<n; i++) {
            int currentProfit = carPrice[i] - minCar;

            if(currentProfit > profit) {
                profit = currentProfit;
            }

            if(carPrice[i] < minCar) {
                minCar = carPrice[i];
            }
        }
        System.out.println(profit);
    }
}