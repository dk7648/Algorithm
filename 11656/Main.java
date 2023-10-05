import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arr = new String[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.substring(i);
        }

        Arrays.sort(arr);

        for(int i=0; i<str.length(); i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
