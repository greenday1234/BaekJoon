import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double result = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");

            if (split[2] != "P") {
                switch (split[2]) {
                    case "A+":
                        result += 4.5 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "A0":
                        result += 4.0 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "B+":
                        result += 3.5 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "B0":
                        result += 3.0 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "C+":
                        result += 2.5 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "C0":
                        result += 2.0 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "D+":
                        result += 1.5 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "D0":
                        result += 1.0 * Double.parseDouble(split[1]);
                        count += Double.parseDouble(split[1]);
                        break;
                    case "F":
                        count += Double.parseDouble(split[1]);
                        break;
                }
            }
        }

        System.out.println(result/count);

        br.close();
    }
}