import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCard = Integer.parseInt(br.readLine());
        int[] card = new int[1001];
        int[] dp = new int[1001];
        String[] input = br.readLine().split(" ");

        for(int i=1; i<=numCard; i++) {
            int pi = Integer.parseInt(input[i-1]);
            card[i] = pi;
        }

        dp[1] = card[1];
        for(int i=1; i<=numCard; i++) {
            dp[i] = card[i];
            for(int j=1; j<=i/2; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + dp[j]);
            }
        }
        System.out.println(dp[numCard]);
    }
}
