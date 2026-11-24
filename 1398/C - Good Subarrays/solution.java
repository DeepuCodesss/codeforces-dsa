import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            Map<Integer, Integer> freq = new HashMap<>();
 
            int prefix = 0;
            long answer = 0;
 
            freq.put(0, 1);
 
            for (int i = 0; i < n; i++) {
 
                int digit = s.charAt(i) - '0';
 
              
                prefix += digit - 1;
 
               
                answer += freq.getOrDefault(prefix, 0);
 
               
                freq.put(
                    prefix,
                    freq.getOrDefault(prefix, 0) + 1
                );
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}