import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            result += a * b;
        }

        if(result != X){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
