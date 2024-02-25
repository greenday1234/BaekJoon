import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String str = br.readLine();
            String[] split = str.split("");
            bw.write(split[0] + split[split.length-1] + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
