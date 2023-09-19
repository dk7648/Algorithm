import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[len];

        for(int i=0; i<len; i++) {
            int curNum = Integer.parseInt(arr[i]);

            while (!stack.isEmpty() && stack.peek() < curNum) {
                if(answer[i-count] != 0) {
                    count++;
                    continue;
                }
                answer[i-count++] = curNum;
                stack.pop();
            }
            stack.push(curNum);
            count = 1;
        }
        for(int i=0; i<len; i++) {
            if(answer[i] == 0)
                sb.append(-1).append(" ");
            else
                sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);
    }
}