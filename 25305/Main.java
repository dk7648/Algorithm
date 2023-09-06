import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int len = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[] arr = new int[len];

        String[] temp = br.readLine().split(" ");

        for(int i=0; i< len; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[len-n]);
    }
}
