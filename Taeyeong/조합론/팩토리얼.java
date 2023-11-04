import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(factorial(N) + "");
        bw.flush();
    }

    public static int factorial(int N) {
        if(N == 0)
            return 1;
        else return N * factorial(N - 1);
    }
}
