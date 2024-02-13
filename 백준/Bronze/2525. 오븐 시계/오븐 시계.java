import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int A = scanner.nextInt();

        if (M + A < 60) {
            M += A;
        }
        else if (M + A >= 60) {
            H += (M + A) / 60;
            M = (M + A) % 60;
            if(H >= 24) {
                H %= 24;
            }
        }

        System.out.println(H + " " + M);

        scanner.close();
    }
}
