import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        HashMap<String, Boolean> hm = new HashMap<>();
        for(int i=0; i<len; i++) {
            String[] input = br.readLine().split(" ");
            hm.put(input[0], input[1].equals("enter"));
        }
        ArrayList<String> arr = new ArrayList<>();
        for(String key : hm.keySet()) {
            if(hm.getOrDefault(key, false))
                arr.add(key);
        }
        arr.sort(Comparator.reverseOrder());
        int size = arr.size();

        for(int i=0; i<size; i++) {
            sb.append(arr.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
