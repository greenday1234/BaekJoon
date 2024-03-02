import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] split = str.split("");

        int left = 0;
        int right = split.length - 1;
        int result = 1;

        while (left < right) {
            if (!split[left++].equals(split[right--])) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}