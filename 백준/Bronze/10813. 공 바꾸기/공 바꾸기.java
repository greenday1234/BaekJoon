import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] basket;
        StringTokenizer st;
        int temp;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken()) - 1;
            int B = Integer.parseInt(st.nextToken()) - 1;

            temp = basket[A];
            basket[A] = basket[B];
            basket[B] = temp;
        }

        for (int i=0; i<N; i++) {
            System.out.print(basket[i] + " ");
        }

        br.close();

    }
}
