import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();

        int result = 0;
        int count = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(ch == '(')
                count++;
            else if(ch == ')') {
                count--;

                if(stack.peek() == '(')
                    result += count;
                else
                    result++;
            }
            stack.push(ch);
        }
        System.out.println(result);
    }
}
