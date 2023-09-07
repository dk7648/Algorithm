import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        HashMap<String, Integer> hm = new HashMap<> ();
        for(int i=0; i<len; i++) {
            hm.put(input[i], 1);
        }

        len = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        for(int i=0; i<len; i++) {
            sb.append(hm.getOrDefault(input[i], 0) + " ");
        }
        System.out.println(sb);

    }
}
