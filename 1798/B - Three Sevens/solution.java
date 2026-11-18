import java.io.*;
 
public class Main {
 
    static class FastScanner {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String[] tokens;
        int index = 0;
 
        int nextInt() throws IOException {
            while (tokens == null || index == tokens.length) {
                tokens = br.readLine().trim().split("\\s+");
                index = 0;
            }
            return Integer.parseInt(tokens[index++]);
        }
    }
 
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            int m = fs.nextInt();
 
            int[][] days = new int[m][];
            int[] lastDay = new int[50001];
 
            // Read participants and record their last participation day
            for (int i = 0; i < m; i++) {
                int n = fs.nextInt();
                days[i] = new int[n];
 
                for (int j = 0; j < n; j++) {
                    int x = fs.nextInt();
 
                    days[i][j] = x;
                    lastDay[x] = i + 1;
                }
            }
 
            int[] winners = new int[m];
            boolean possible = true;
 
            // Find one valid winner for every day
            for (int i = 0; i < m; i++) {
 
                for (int x : days[i]) {
                    if (lastDay[x] == i + 1) {
                        winners[i] = x;
                        break;
                    }
                }
 
                if (winners[i] == 0) {
                    possible = false;
                    break;
                }
            }
 
            if (!possible) {
                out.append("-1
");
            } else {
                for (int x : winners) {
                    out.append(x).append(" ");
                }
                out.append("
");
            }
        }
 
        System.out.print(out);
    }
}