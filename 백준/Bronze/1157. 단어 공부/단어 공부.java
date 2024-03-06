import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int max = -1;
        char ch = '?';

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                arr[str.charAt(i) - 97]++;
            } else {
                arr[str.charAt(i) - 65]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

        br.close();
    }
}