import java.io.*;

public class Main {
    public static int[][] dp = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(factorial(n) + "");
        bw.flush();

    }

    static long factorial(int n) {
        if(n == 0)
            return 1;
        else return n * factorial(n - 1);
    }
}
