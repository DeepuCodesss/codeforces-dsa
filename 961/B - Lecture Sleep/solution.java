import java.util.*;
import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        int[] a = new int[n];
        int[] t = new int[n];
 
        st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
 
        st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }
 
        long awake = 0;
        long window = 0;
        long maxExtra = 0;
 
        for (int i = 0; i < n; i++) {
 
       
            if (t[i] == 1) {
                awake += a[i];
            }
 
            
            if (t[i] == 0) {
                window += a[i];
            }
 
        
            if (i >= k && t[i - k] == 0) {
                window -= a[i - k];
            }
 
           
            if (i >= k - 1) {
                maxExtra = Math.max(maxExtra, window);
            }
        }
 
        System.out.println(awake + maxExtra);
 
        br.close();
    }
}