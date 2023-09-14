import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(func(N));
    }
    public static long func(int N) {
        if(N == 1) return 1;
        if(N == 0) return 1;
        return N * func(N-1);
    }
}
