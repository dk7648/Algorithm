import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int len = input.length();
        for(int i=0; i<len; i++) {
            int n = input.charAt(i) - '0';

            sb.append(n/4); n %= 4;
            sb.append(n/2); n %= 2;
            sb.append(n);
        }


        while(sb.indexOf("0") == 0)
            sb.deleteCharAt(0);

        if(sb.length() == 0)
            sb.append(0);

        System.out.println(sb);
    }
}
