import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];

        String[] input = br.readLine().split(" ");
        dp[0][0] = Integer.parseInt(input[0]);
        dp[0][1] = Integer.parseInt(input[1]);
        dp[0][2] = Integer.parseInt(input[2]);


        for (int i = 1; i < n; i++) {
            input = br.readLine().split(" ");

            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + Integer.parseInt(input[0]);
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + Integer.parseInt(input[1]);
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + Integer.parseInt(input[2]);
        }

        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
    }
}
