import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int sum = 0;
        for(int i: arr)
            sum += i;
        int me = arr[(arr.length) / 2];
        int range = arr[arr.length - 1] - arr[0];

        int count = 0;
        int max = -1;
        int mode = arr[0];
        boolean flag = false;

        for(int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1])
                count++;
            else count = 0;

            if(count > max) {
                max = count;
                mode = arr[i];
                flag = true;
            } else if(count == max && flag) {
                mode = arr[i];
                flag = false;
            }
        }
        bw.write((int)Math.round(((double)sum / arr.length)) + "\n" + me + "\n" + mode + "\n" + range);
        bw.flush();

    }

}
