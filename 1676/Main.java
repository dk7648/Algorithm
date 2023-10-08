import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int n2 = 0;
        int n5 = 0;
        for(int i=num; i>0; i--) {
            int cur = i;
            while(cur % 2 == 0) {
                cur = cur / 2;
                n2++;
            }
            while(cur % 5 == 0) {
                cur = cur / 5;
                n5++;
            }
        }

        int result = n2 > n5 ? n5 : n2;
        System.out.println(result);
    }
}
