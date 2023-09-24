import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int len = str.length();

        Stack<Character> op = new Stack<>();

        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);

            switch(ch) {
                case '*':
                case '/':
                case '+':
                case '-':
                    while(!op.isEmpty() && priority(op.peek()) >= priority(ch))
                        sb.append(op.pop());
                    op.push(ch);
                    break;
                case '(':
                    op.push(ch);
                    break;
                case ')':
                    while(!op.isEmpty() && op.peek() != '(')
                        sb.append(op.pop());
                    op.pop();
                    break;
                default:
                    sb.append(ch);
            }
        }
        while(!op.isEmpty())
            sb.append(op.pop());

        System.out.println(sb);
    }
    public static int priority(char op) {
        if(op == '*' || op == '/')
            return 2;
        if(op == '+' || op == '-')
            return 1;
        if(op == '(' || op == ')')
            return 0;
        return -1;
    }
}