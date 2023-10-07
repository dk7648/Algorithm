import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        if(M == 1) M = 2;

        loop:
        for (int i = M; i <= N; i++) {
            for(int j=2; j*j<=i; j++) {
                if(i%j == 0)
                    continue loop;
            }
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
