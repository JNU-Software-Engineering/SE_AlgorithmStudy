import java.io.*;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<String> set = new TreeSet<>();
        int N = Integer.parseInt(br.readLine());
        boolean bool = false;

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");

            if(str[0].equals("ChongChong") || str[1].equals("ChongChong")) {
                bool = true;
                set.add("ChongChong");
            }
            if(bool) {
                if(set.contains(str[0]) || set.contains(str[1])){
                    set.add(str[0]);
                    set.add(str[1]);
                }
            }
        }
        bw.write(set.size() + "");
        bw.flush();

    }

}
