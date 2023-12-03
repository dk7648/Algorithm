import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    private static int N;
    private static int M;
    private static int[] wires;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        wires = new int[N];
        for (int i = 0; i < N; i++) {
            wires[i] = Integer.parseInt(br.readLine());
        }

        long start = 0;
        long end = 4294967295L;
        long cur = (start + end) / 2;
        while (start+1 < end) {
            long result = search(cur);
            if(result >= M) {
                start = cur;
            }
            else {
                end = cur;
            }
            cur = (start + end) / 2;
        }

        System.out.println(cur);
    }
    public static long search(long cur) {
        long result = 0;
        for (int i = 0; i < N; i++) {
            result += wires[i] / cur;
        }
        return result;
    }
}
