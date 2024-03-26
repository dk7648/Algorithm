import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int before, int mid, int after) {
        if (n == 1) {
            sb.append(before + " " + after + "\n");
            return;
        }

        hanoi(n - 1, before, after, mid);
        sb.append(before + " " + after + "\n");
        hanoi(n - 1, mid, before, after);
    }
}