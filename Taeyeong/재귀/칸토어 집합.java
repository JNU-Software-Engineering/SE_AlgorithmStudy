import java.io.*;
import java.util.Arrays;

public class Main {

    static char[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int n = Integer.parseInt(str);
            arr = new char[(int) Math.pow(3, n)];
            Arrays.fill(arr, '-');
            Cantor(0, arr.length);
            for(int i = 0; i < arr.length; i++){
                bw.write(arr[i]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    static void Cantor(int start, int size){
        if(size == 1)
            return;
        int newSize = size / 3;
        for(int i = start + newSize; i < start + 2*newSize; i++) {
            arr[i] = ' ';
        }
        Cantor(start, newSize);
        Cantor(start + 2*newSize, newSize);
    }
}

