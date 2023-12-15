import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        boolean[] isVisit = new boolean[n];

        int pos = 0;
        for(int i=1; i<n; i++) {
            if(arr[i-1] < arr[i]) {
                pos = i;
            }
        }
        if(pos == 0) {
            System.out.println(-1);
            return;
        }

        for(int i=0; i<pos-1; i++) {
            isVisit[arr[i]-1] = true;
        }

        int k = arr[pos-1];
        while(isVisit[k]) {
            k++;
        }
        arr[pos-1] = k+1;
        isVisit[k] = true;

        k=0;
        for(int i=pos; i<n; i++) {
            while(isVisit[k]) {
                k++;
            }
            arr[i] = k+1;
            isVisit[k] = true;
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}
