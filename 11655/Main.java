import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                sb.append((char)((ch-'a'+13)%26+'a'));
            }
            else if(ch >= 'A' && ch <= 'Z') {
                sb.append((char)((ch-'A'+13)%26+'A'));
            }
            else {
                sb.append(ch);
            }

        }

        System.out.println(sb);
    }
}
