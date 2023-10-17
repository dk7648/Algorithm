import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int i=2;

        while(n > 1) {
            if(n % i == 0) {
                n = n / i;
                sb.append(i).append('\n');
                continue;
            }
            i++;
        }
        System.out.println(sb);
    }
}
