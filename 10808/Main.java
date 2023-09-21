import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        String str = br.readLine();
        int len = str.length();

        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0; i<26; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
