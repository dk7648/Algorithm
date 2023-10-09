import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long result = 0;
        int len = Integer.parseInt(br.readLine());

        for(int i=0; i<len; i++) {
            String[] input = br.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            int[] arr = new int[num];

            for(int j=0; j<num; j++) {
                arr[j] = Integer.parseInt(input[j+1]);
            }
            for(int j=0; j<num-1; j++) {
                for(int k=j+1; k<num; k++) {
                    result += findGCD(arr[j], arr[k]);
                }
            }
            sb.append(result).append("\n");
            result = 0;
        }
        System.out.println(sb);
    }

    public static int findGCD(int num1, int num2) {
        if(num1 % num2 == 0)
            return num2;
        return findGCD(num2, num1 % num2);
    }
}
