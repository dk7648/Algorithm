import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int arr[];
    private static StringBuilder sb;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        arr = new int[M];

        dfs(N, M, 0);
        System.out.println(sb);
    }
    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int num : arr) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<N; i++) {
            arr[depth] = i+1;
            dfs(N,M,depth+1);
        }
    }
}
