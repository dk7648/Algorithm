import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int[] fraction1 = new int[2];
        fraction1[0] = Integer.parseInt(input[0]);
        fraction1[1] = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        int[] fraction2 = new int[2];
        fraction2[0] = Integer.parseInt(input[0]);
        fraction2[1] = Integer.parseInt(input[1]);

        int[] result = new int[2];
        result[0] = fraction1[0] * fraction2[1] + fraction2[0] * fraction1[1];
        result[1] = fraction1[1] * fraction2[1];

        int n = gdc(result[0], result[1]);
        result[0] /= n;
        result[1] /= n;

        sb.append(result[0]).append(" ").append(result[1]);
        System.out.println(sb);

    }
    public static int gdc(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gdc(num2, num1 % num2);
    }
}
