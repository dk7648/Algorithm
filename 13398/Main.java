import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(input[i - 1]);
        }

        int[] dp = new int[n + 1];
        int[] dp2 = new int[n + 2];

        int max = -10000;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            if(max < dp[i])
                max = dp[i];
        }
        for (int i = n; i > 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr[i], arr[i]);
        }

        for (int i = 2; i < n; i++) {
            int temp = dp[i - 1] + dp2[i + 1];

            if(max < temp)
                max = temp;
        }

        System.out.println(max);
    }
}
