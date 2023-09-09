import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, String> hm = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            String index = String.valueOf(i);
            hm.put(name, index);
            hm.put(index, name);
        }

        for(int i=0; i<M; i++) {
            String t = br.readLine();
            sb.append(hm.get(t)).append("\n");
        }

        System.out.println(sb);
    }
}
