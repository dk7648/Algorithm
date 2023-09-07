import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++) {
            int change = Integer.parseInt(br.readLine());

            sb.append(change/25 + " ");
            change = change % 25;

            sb.append(change/10 + " ");
            change = change %10;

            sb.append(change/5 + " ");
            change = change % 5;

            sb.append(change + "\n");
            change = 0;
        }
        System.out.println(sb);
    }
}