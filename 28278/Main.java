import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);
            switch(command) {
                case 1:
                    int data = Integer.parseInt(input[1]);
                    stack.push(data); break;
                case 2:
                    if(stack.isEmpty())  sb.append(-1);
                    if(!stack.isEmpty()) sb.append(stack.pop());
                    sb.append('\n'); break;
                case 3:
                    sb.append(stack.size()).append('\n'); break;
                case 4:
                    if(stack.isEmpty()) sb.append(1);
                    if(!stack.isEmpty()) sb.append(0);
                    sb.append('\n'); break;
                case 5:
                    if(stack.isEmpty())sb.append(-1);
                    if(!stack.isEmpty()) sb.append(stack.peek());
                    sb.append('\n'); break;
                default:
                    System.out.println("Error");
            }

        }
        System.out.println(sb);
    }
}
