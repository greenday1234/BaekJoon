import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr;
        double max = 0;
        double result = 0;
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        arr = new double[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            result += arr[i];
        }

        System.out.println(result/N);

        br.close();
    }
}
