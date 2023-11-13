import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int LIMIT_EARTH = 15;
        final int LIMIT_STAR = 28;
        final int LIMIT_MOON = 19;

        String[] input = br.readLine().split(" ");
        final int EARTH = Integer.parseInt(input[0]);
        final int STAR = Integer.parseInt(input[1]);
        final int MOON = Integer.parseInt(input[2]);

        int earth = 1;
        int star = 1;
        int moon = 1;
        int count = 1;

        while(true) {
            if(earth == EARTH && star == STAR && moon == MOON) {
                break;
            }
            earth = earth % LIMIT_EARTH + 1;
            star = star % LIMIT_STAR + 1;
            moon = moon % LIMIT_MOON + 1;
            count++;
        }

        System.out.println(count);
    }
}
