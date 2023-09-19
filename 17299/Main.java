import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] answer = new int[len];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<len; i++) {
            int n = Integer.parseInt(arr[i]);
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        Stack<Integer> stack = new Stack<>();
        Arrays.fill(answer, -1);
        int count = 1;
        for(int i=0; i<len; i++) {
            int curNum = Integer.parseInt(arr[i]);

            int cur = hm.get(curNum);

            while(!stack.isEmpty() && hm.get(stack.peek()) < cur) {
                while(answer[i-count] != -1) {
                    count++;
                }
                answer[i-count] = curNum;
                stack.pop();
            }
            stack.push(curNum);
            count = 1;
        }

        for(int i=0; i<len; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}