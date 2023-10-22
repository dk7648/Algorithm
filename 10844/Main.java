import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] dp = new int[101][10];
        int result = 0;
        for(int i=1; i<10; i++)
            dp[1][i] = 1;


        for(int i=2; i<101; i++) {
            for(int j=0; j<10; j++) {
                if(j==0)
                    dp[i][j] = dp[i-1][1];
                else if(j==9)
                    dp[i][j] = dp[i-1][8];
                else
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
                dp[i][j] = dp[i][j] % 1000000000;
            }
        }

        int n = Integer.parseInt(br.readLine());
        for(int j=0; j<10; j++) {
            result += dp[n][j];
            result = result % 1000000000;
        }
        System.out.println(result);
    }


}
