import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int result = 10;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
        }

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < j; i++) {
                if (arr[j] == arr[i]) {
                    result--;
                    break;
                }
            }
        }

        System.out.println(result);

        br.close();
    }
}
