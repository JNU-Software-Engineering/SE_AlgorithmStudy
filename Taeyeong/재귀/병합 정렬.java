import java.io.*;

public class Main {

    static int[] sorted;
    static int count = 0;
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int[] arr = new int[n];
        sorted = new int[n];

        str = br.readLine().split(" ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        merge_sort(arr, 0, arr.length - 1, k);
        bw.write(result + "");
        bw.flush();

    }

    static void merge_sort(int[] arr, int p, int r, int k){
        if(p < r) {
            int m = (p + r) / 2;
            merge_sort(arr, p, m, k);
            merge_sort(arr, m + 1, r, k);
            merge(arr, p, m, r, k);
        }
    }
    static void merge(int[] arr, int p, int m, int r, int k) {
        int i = p;
        int j = m + 1;
        int tmp = 0;
        while(i <= m && j <= r) {
            if(arr[i] <= arr[j])
                sorted[tmp++] = arr[i++];
            else
                sorted[tmp++] = arr[j++];
        }
        while(i <= m)
            sorted[tmp++] = arr[i++];
        while(j <= r)
            sorted[tmp++] = arr[j++];
        i = p;
        tmp = 0;
        while(i <= r){
            arr[i++] = sorted[tmp++];
            count++;
            if(count == k){
                result = arr[--i];
                i++;
            }
        }
    }
}
