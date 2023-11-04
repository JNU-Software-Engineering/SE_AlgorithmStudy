import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        if(K == 0) {
            bw.write("1");
            bw.flush();
            return;
        }
        int a = N;
        for(int i = 0; i < K - 1; i++) {
            N *= --a;
        }
        bw.write(N / factorial(K) + "");
        bw.flush();
    }

    public static int factorial(int N) {
        if(N == 0)
            return 1;
        else return N * factorial(N - 1);
    }

}