import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        HashSet<String> hs = new HashSet<>();

        int len = input.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                hs.add(input.substring(i,j));
            }
        }
        System.out.println(hs.size());
    }
}
