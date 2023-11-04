import java.io.*;

public class Main {
    public static int[][] dp = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int n, k;
        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            k = Integer.parseInt(str[0]);
            n = Integer.parseInt(str[1]);
            bw.write(combination(n, k) + "\n");
        }
        bw.flush();

    }
    static int combination(int n, int k){
        if(dp[n][k] != 0)
            return dp[n][k];
        if(n == k || k == 0){
            dp[n][k] = 1;
            return dp[n][k];
        } else {
            dp[n][k] = combination(n - 1, k - 1) + combination(n - 1, k);
            return dp[n][k];
        }
    }
}