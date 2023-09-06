import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        int[] input = new int[len];
        for(int i=0; i<len; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);
        for(int i=0; i<len; i++) {
            sb.append(input[i] + "\n");
        }

        System.out.println(sb);
    }
}
