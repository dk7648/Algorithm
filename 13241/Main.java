import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        String[] input = br.readLine().split(" ");
        long num1 = Integer.parseInt(input[0]);
        long num2 = Integer.parseInt(input[1]);

        System.out.println(num1*num2 / gcd(num1,num2));
    }
    public static long gcd(long num1, long num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}