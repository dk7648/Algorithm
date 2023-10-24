import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[][] dp = new int[201][201];
        for(int i=0; i<201; i++) {
            dp[i][1] = 1;
            dp[i][2] = i+1;
            dp[0][i] = 1;
            dp[1][i] = i;
        }

        for(int i=3; i<=k; i++) {
            for(int h=2; h<=n; h++)
                for(int j=0; j<=h; j++) {
                    dp[h][i] += dp[j][i-1];
                    dp[h][i] = dp[h][i] % 1000000000;
                }
        }

        System.out.println(dp[n][k] % 1000000000);
    }
}

