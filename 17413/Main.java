import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] str = br.readLine().split("");

        int len = str.length;
        for(int i=0; i<len; i++) {
            if(str[i].equals(" ") || str[i].equals("<")) {
                while (stack.isEmpty() == false)
                    sb.append(stack.pop());

                if(str[i].equals("<")) {
                        while(!str[i].equals(">"))
                            sb.append(str[i++]);
                    sb.append(str[i]);
                }
                if(str[i].equals(" "))
                    sb.append(str[i]);
            }
            else
                stack.push(str[i]);
        }
        while (stack.isEmpty() == false)
            sb.append(stack.pop());

        System.out.println(sb);
    }
}
