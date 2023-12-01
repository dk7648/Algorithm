import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        arr = new int[M];
        dfs(N,M,0,0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth, int pos) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = pos; i < N; i++) {
            arr[depth] = i+1;
            dfs(N,M,depth+1, i);
        }
    }
}
