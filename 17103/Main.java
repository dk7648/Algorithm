import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] primeNumberArr = new boolean[1000001];
        findPrimeNumber(primeNumberArr);

        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++) {
            int input = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j=0; j<=input/2; j++) {
                if(primeNumberArr[j] && primeNumberArr[input - j])
                    count++;
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    public static void findPrimeNumber(boolean[] primeNumberArr) {
        int max = primeNumberArr.length;
        primeNumberArr[0] = primeNumberArr[1] = false;

        for(int i=2; i<max; i++) {
            primeNumberArr[i] = true;
        }

        for(int i=2; i*i<max; i++) {
            if(primeNumberArr[i]) {
                for(int j=i*i; j<max; j+=i) {
                    primeNumberArr[j] = false;
                }
            }
        }
    }
}
