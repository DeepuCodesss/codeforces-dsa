import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        int t = Integer.parseInt(br.readLine().trim());
 
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
 
            int current = n;
 
            sb.append(2).append('
');
 
            for (int i = n - 1; i >= 1; i--) {
 
                sb.append(current)
                  .append(" ")
                  .append(i)
                  .append('
');
 
                current = (current + i + 1) / 2;
            }
        }
 
        System.out.print(sb);
    }
}