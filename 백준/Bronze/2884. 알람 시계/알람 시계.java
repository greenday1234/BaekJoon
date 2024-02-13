import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M >= 45) {
            M -= 45;
        }
        else if (M < 45 && H > 0) {
            M += 15;
            H -= 1;
        }
        else if (M < 45 && H == 0) {
            M += 15;
            H += 23;
        }

        System.out.println(H + " " + M);

        scanner.close();
    }
}
