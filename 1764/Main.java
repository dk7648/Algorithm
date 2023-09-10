import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<N; i++) {
            hm.put(br.readLine(), 1);
        }

        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<M; i++) {
            String t = br.readLine();
            if(hm.getOrDefault(t, 0) == 1) {
                list.add(t);
            }
        }

        Collections.sort(list);
        sb.append(list.size()).append("\n");

        for(String str : list) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
