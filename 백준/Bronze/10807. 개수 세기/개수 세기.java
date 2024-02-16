import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st;
        int result = 0;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (arr.get(i) == v) {
                result++;
            }
        }
        System.out.println(result);
        
        br.close();

    }
}
