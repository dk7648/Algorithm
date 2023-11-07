import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        Integer[] arr = new Integer[9];

        for (int i = 0; i < 9; i++) {
            int height = Integer.parseInt(br.readLine());
            sum += height;
            arr[i] = height;
        }

        Arrays.sort(arr);

        loop:
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if (sum - arr[i] - arr[k] == 100) {
                    arr[i] = -1;
                    arr[k] = -1;
                    break loop;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] <= 0) {
                continue;
            }
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
