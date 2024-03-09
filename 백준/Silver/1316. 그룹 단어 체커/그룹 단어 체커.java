import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (isCheck()) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }

    private static boolean isCheck() throws IOException {

        boolean[] check = new boolean[26];
        int pre = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (pre != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    pre = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}