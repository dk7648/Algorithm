import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] dp = new int[len];
        int[] num = new int[len];
        int result = 0;
        String[] input = br.readLine().split(" ");

        for(int i=0; i<len; i++)
            num[i] = Integer.parseInt(input[i]);

        for(int i=0; i<len; i++) {
            dp[i] = 1;
            for(int j=i-1; j>=0; j--) {
                if(num[i] > num[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}
