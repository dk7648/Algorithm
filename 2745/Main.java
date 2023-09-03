import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int len = input[0].length();
        int num = Integer.parseInt(input[1]);

        long result = 0;

        for(int i=0; i<len; i++) {
            char ch = input[0].charAt(len-1-i);
            int n;

            if(Character.isDigit(ch) != true) {
                n = (int)ch - 'A' + 10;
            }
            else {
                n = ch - '0';
            }

            result += n * square(num,i);
        }

        System.out.println(result);

    }
    public static long square(long num, int repeat) {
        long origin = num;
        if(repeat == 0) return 1;

        for(int i=1; i<repeat; i++)
            num *= origin;

        return num;
    }
}