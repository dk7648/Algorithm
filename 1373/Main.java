import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int len = input.length();

        if(len % 3 == 1) {
            sb.append(input.charAt(0));
        }
        if(len % 3 == 2) {
            sb.append(2*(input.charAt(0)-'0')  + (input.charAt(1)-'0'));
        }

        for(int i=len % 3; i<len; i+=3) {
            sb.append(4*(input.charAt(i)-'0') + 2*(input.charAt(i+1)-'0') + (input.charAt(i+2)-'0'));
        }
        System.out.println(sb);
    }
}
