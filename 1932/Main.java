import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][n + 1];
        String[][] input = new String[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = br.readLine().split(" ");
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                dp[i][k] = Math.max(dp[i - 1][k - 1], dp[i - 1][k]) + Integer.parseInt(input[i][k - 1]);
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (max < dp[n][i]) {
                max = dp[n][i];
            }
        }

        System.out.println(max);
    }
}
