import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        int beforeMax = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(br.readLine()));
            max = Math.max(max, arr.get(i));
            if(beforeMax != max) {
                index = i;
                beforeMax = max;
            }
        }

        System.out.println(max);
        System.out.println(index+1);

        br.close();

    }
}
