import java.io.*;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<String> set = new TreeSet<>();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(!str.equals("ENTER")){
                if(!set.contains(str)){
                    set.add(str);
                    count++;
                }
            } else {
                set.clear();
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}
