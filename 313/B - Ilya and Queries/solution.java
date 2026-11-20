import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        String s = br.readLine().trim();
        int n = s.length();
 
        int[] prefix = new int[n];
 
        // Build prefix sum
        for (int i = 1; i < n; i++) {
 
            prefix[i] = prefix[i - 1];
 
            if (s.charAt(i) == s.charAt(i - 1)) {
                prefix[i]++;
            }
        }
 
        int m = Integer.parseInt(br.readLine().trim());
 
        StringBuilder ans = new StringBuilder();
 
        while (m-- > 0) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
 
            int result = prefix[r - 1] - prefix[l - 1];
 
            ans.append(result).append('
');
        }
 
        System.out.print(ans);
    }
}