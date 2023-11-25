import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int digit = getDigit(n);
        int start = 1;
        int end = 10;
        int count = 0;
        for(int i=1; i<digit; i++) {
            count += (end-start) * i;
            start *= 10;
            end *= 10;
        }
        count += (n-start) * digit;
        count += digit;
        System.out.println(count);
    }
    public static int getDigit(int num) {
        int count = 0;
        while(num > 0) {
            num = num/10;
            count++;
        }
        return count;
    }
}
