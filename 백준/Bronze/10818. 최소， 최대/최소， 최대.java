import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st;
        int max;
        int min;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        max = arr.get(0);
        min = arr.get(0);

        for (int i = 1; i < N; i++) {
            if(Math.max(arr.get(i - 1), arr.get(i)) > max){
                max = Math.max(arr.get(i - 1), arr.get(i));
            }
            if(Math.min(arr.get(i - 1), arr.get(i)) < min){
                min = Math.min(arr.get(i - 1), arr.get(i));
            }
        }

        System.out.println(min + " " + max);

        br.close();

    }
}
