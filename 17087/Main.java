import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int pos = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int[] gap = new int[num];
        int min = 1000000000;
        int min_index = 0;
        for(int i=0; i<num; i++) {
            gap[i] = Math.abs(Integer.parseInt(input[i]) - pos);
            if(gap[i] < min) {
                min = gap[i];
                min_index = i;
            }
        }

        int gcd;
        for(int i=0; i<num; i++) {
                gcd = GCD(gap[min_index], gap[i]);
                if(gcd < min)
                    min = gcd;
        }

        System.out.println(min);
    }

    public static int GCD(int num1, int num2) {
        if(num1 % num2 == 0)
            return num2;
        return GCD(num2, num1%num2);
    }
}

