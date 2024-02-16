import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] basket;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        basket = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int repeat = Integer.parseInt(st.nextToken());

            for (int j = A; j <= B; j++) {
                basket[j-1] = repeat;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }

        br.close();

    }
}
