import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String input = br.readLine();
        double[] arr = new double[len];
        for(int i=0; i<len; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        len = input.length();
        for(int i=0; i<len; i++) {
            int ch = input.charAt(i);
            if('A' <= ch && ch <= 'Z') {
                stack.push(arr[ch-'A']);
            }
            else {
                double num2 = stack.pop();
                double num1 = stack.pop();

                switch(ch) {
                    case '+':
                        stack.push(num1+num2); break;
                    case '-':
                        stack.push(num1-num2); break;
                    case '*':
                        stack.push(num1*num2); break;
                    case '/':
                        stack.push(num1/num2); break;
                }
            }
        }

        System.out.println(String.format("%.2f", stack.pop()));

    }
}