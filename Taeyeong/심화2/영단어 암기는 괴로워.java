import java.io.*;
import java.util.Arrays;
import java.util.HashMap;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            if(str.length() >= m) {
                if(!map.containsKey(str))
                    map.put(str, 1);
                else map.put(str, map.get(str) + 1);
            }
        }
        String[] str = new String[map.size()];
        int index = 0;
        for(String s1: map.keySet()){
            str[index++] = s1;
        }

        Arrays.sort(str, (str1, str2) -> {
            if(map.get(str1) > map.get(str2))
                return -1;
            else if(map.get(str1) < map.get(str2))
                return 1;
            else {
                if(str1.length() != str2.length())
                    return str2.length() - str1.length();
                else return str1.compareTo(str2);
            }
        });
        for(String s1:str)
            bw.write(s1 + "\n");
        bw.flush();
    }
}