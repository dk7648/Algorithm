import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int len = 1000001;
        int[] dp = new int[len];

        dp[0] = 0; dp[1] = 0; dp[2] = 1; dp[3] = 1;
        for(int i=4; i<len; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 3 == 0)
                if(dp[i/3]+1 < dp[i])
                    dp[i] = dp[i/3]+1;
            if(i % 2 == 0)
                if(dp[i/2]+1 < dp[i])
                    dp[i] = dp[i/2]+1;
        }

        System.out.println(dp[n]);
    }
}
