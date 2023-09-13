import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            sb.append(num1*num2 / gcd(num1,num2)).append("\n");
        }

        System.out.println(sb);
    }
    public static int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
