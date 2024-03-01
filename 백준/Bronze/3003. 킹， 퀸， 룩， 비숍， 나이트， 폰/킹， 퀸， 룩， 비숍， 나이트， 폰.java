import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] p = {1, 1, 2, 2, 2, 8};

        //1 1 2 2 2 8

        for (int i = 0; i < 6; i++) {
            int n = Integer.parseInt(st.nextToken());

            if (p[i] == n) {
                p[i] = 0;
            } else if (p[i] > n) {
                p[i] -= n;
            } else {
                p[i] = -(n - p[i]);
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(p[i] + " ");
        }
    }
}