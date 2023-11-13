import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = (int)Math.pow(2, n) - 1;
        bw.write(count + "\n");
        hanoi(n, '1', '2', '3');
        bw.flush();
    }

    // s(출발지)에서 t(임시 장소)를 거쳐서 d(목적지)로 n개를 이동 시키는 메소드 정의
    static void hanoi(int n, char s, char t, char d) throws IOException {
        if(n == 0)
            return;
        else {
            hanoi(n-1, s, d, t);
            bw.write(s + " " + d + "\n");
            hanoi(n-1, t, s, d);
        }
    }
}