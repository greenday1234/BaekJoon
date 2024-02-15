import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {
            for (int i = T; i > j+1; i--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        br.close();
    }
}
