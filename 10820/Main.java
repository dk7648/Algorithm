import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while((str = br.readLine()) != null) {
            int[] arr = new int[4];
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);

                if(ch >= 'a' && ch <= 'z')
                    arr[0]++;
                if(ch >= 'A' && ch <= 'Z')
                    arr[1]++;
                if(ch >= '0' && ch <= '9')
                    arr[2]++;
                if(ch == ' ')
                    arr[3]++;
            }
            for(int i=0; i<4; i++)
                sb.append(arr[i]).append(" ");
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
