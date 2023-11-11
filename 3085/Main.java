import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split("");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n; k++) {
                swap(i, k, i + 1, k);
                max = Math.max(max, getMax());
                swap(i, k, i + 1, k);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - 1; k++) {
                swap(i, k, i, k + 1);
                max = Math.max(max, getMax());
                swap(i, k + 1, i, k);
            }
        }
        System.out.println(max);
    }

    public static void swap(int index1_y, int index1_x, int index2_y, int index2_x) {
        String temp = arr[index1_y][index1_x];
        arr[index1_y][index1_x] = arr[index2_y][index2_x];
        arr[index2_y][index2_x] = temp;
    }

    public static int getMax() {
        int max = 0;
        for (int i = 0; i < n; i++) {
            String prev = "";
            int count = 1;
            for (int k = 0; k < n; k++) {
                if (!prev.equals(arr[i][k])) {
                    max = Math.max(max, count);
                    prev = arr[i][k];
                    count = 1;
                    continue;
                }
                count++;
            }
            max = Math.max(max, count);
        }

        for (int i = 0; i < n; i++) {
            String prev = "";
            int count = 1;
            for (int k = 0; k < n; k++) {
                if (!prev.equals(arr[k][i])) {
                    max = Math.max(max, count);
                    prev = arr[k][i];
                    count = 1;
                    continue;
                }
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
