import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        HashSet<String> hs = new HashSet<>();

        int A_length = Integer.parseInt(input[0]);
        String[] A = br.readLine().split(" ");

        for (int i = 0; i < A_length; i++) {
            hs.add(A[i]);
        }

        int B_length = Integer.parseInt(input[1]);
        String[] B = br.readLine().split(" ");

        for (int i = 0; i < B_length; i++) {
            if(hs.contains(B[i]))
                hs.remove(B[i]);
            else
                hs.add(B[i]);
        }

        System.out.println(hs.size());
    }
}
