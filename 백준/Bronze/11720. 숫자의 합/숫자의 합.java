import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        String str = br.readLine();
        String[] split = str.split("");

        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(split[i]);
        }
        System.out.println(result);

        br.close();
    }
}
