import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static StringBuilder sb;
    private static boolean[] isVisit;
    private static int[] arr;
    private static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        isVisit = new boolean[N];
        result = new int[M];
        arr = new int[N];

        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int num : result) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        int before = -1;
        for (int i = 0; i < N; i++) {
            if (!isVisit[i] && before != arr[i]) {
                isVisit[i] = true;
                result[depth] = arr[i];
                before = arr[i];
                dfs(N, M, depth + 1);

                isVisit[i] = false;
            }
        }
    }
}