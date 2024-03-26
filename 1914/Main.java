import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger result = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            result = result.multiply(new BigInteger("2"));
        }
        result = result.subtract(new BigInteger("1"));
        sb.append(result).append('\n');

        if (n <= 20)
            hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int before, int mid, int after) {
        if (n == 1) {
            sb.append(before + " " + after).append('\n');
            return;
        }

        hanoi(n - 1, before, after, mid);
        sb.append(before + " " + after).append('\n');
        hanoi(n - 1, mid, before, after);
    }
}