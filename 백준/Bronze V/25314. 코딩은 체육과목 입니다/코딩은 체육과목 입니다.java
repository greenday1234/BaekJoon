import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int result = N / 4;

        for (int i = 0; i < result; i++) {
            System.out.print("long ");
        }

        System.out.println("int");

        scanner.close();
    }
}
