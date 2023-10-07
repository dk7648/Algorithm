import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static int MAX = 1000001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        boolean[] primeNumber = new boolean[MAX];
        findPrimeNumber(primeNumber);

        int n = Integer.parseInt(br.readLine());
        while(n > 0) {
            for(int i=3; i<=n/2; i+=2) {
                if(primeNumber[i] && primeNumber[n-i]) {
                    sb.append(n).append(" = ").append(i).append(" + ").append(n - i).append("\n");
                    break;
                }
            }

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }
    public static void findPrimeNumber(boolean[] primeNumber) {
        for(int i=2;i <MAX; i++) {
            primeNumber[i] = true;
        }

        for(int i=2; i*i<MAX; i++) {
            if(primeNumber[i])
                for(int j=i*i; j<MAX; j+=i) {
                    primeNumber[j] = false;
                }
        }
    }
}
