import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        String[][] input = new String[repeat][4];
        for (int i = 0; i < repeat; i++) {
            input[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < repeat; i++) {
            boolean check = false;

            int M = Integer.parseInt(input[i][0]);
            int N = Integer.parseInt(input[i][1]);
            int targetX = Integer.parseInt(input[i][2]) - 1;
            int targetY = Integer.parseInt(input[i][3]) - 1;

            int end = LCM(M, N);

            for (int k = targetX; k < end; k += M) {
                if (k % N == targetY) {
                    System.out.println(k + 1);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1 % num2);
    }

    public static int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }
}