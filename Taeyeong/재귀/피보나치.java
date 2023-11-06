import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(fibo(n) + "");
        bw.flush();

    }

    static int fibo(int n) {
        if(n == 0 || n == 1)
            return n;
        else return fibo(n - 1) + fibo(n - 2);
    }
}
