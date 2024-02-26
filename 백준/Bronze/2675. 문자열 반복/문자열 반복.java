import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            String[] split = S.split("");

            for (int j = 0; j < S.length(); j++) {
                for (int k=0; k<R; k++) {
                    bw.write(split[j]);
                }
            }
            bw.write("\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
