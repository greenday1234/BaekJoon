import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int j=0; j<T; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        br.close();
    }
}
