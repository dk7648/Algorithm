import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Integer[] arr = new Integer[len];

        //원본 값
        for(int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        //중복값 제거
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        Integer[] temp = hashSet.toArray(new Integer[0]);

        Arrays.sort(temp);
        int temp_size = temp.length;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for(int i=0; i<temp_size; i++) {
            hashMap.put(temp[i], count++);
        }

        for(int i=0; i<len; i++) {
            sb.append(hashMap.get(arr[i]) + " ");
        }

        System.out.println(sb);

    }
}
