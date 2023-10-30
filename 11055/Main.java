import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[len + 1];

        for (int i = 1; i <= len; i++) {
            arr[i] = Integer.parseInt(input[i - 1]);
        }

        int[][] dp = new int[len + 1][3];
        for (int i = 1; i <= len; i++) {
            dp[i][1] = 1;
            dp[i][2] = arr[i];
            for (int j = i - 1; j > 0; j--) {
                if (arr[i] > arr[j]) {
                    dp[i][1] = Math.max(dp[i][1], dp[j][1] + 1);
                    dp[i][2] = Math.max(dp[i][2], arr[i] + dp[j][2]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= len; i++) {
            if (max < dp[i][2])
                max = dp[i][2];
        }

        System.out.println(max);

    }
}
