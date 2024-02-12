import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        if (A <= 100 && A >= 90) {
            System.out.println("A");
        }
        if (A <= 89 && A >= 80) {
            System.out.println("B");
        }
        if (A <= 79 && A >= 70) {
            System.out.println("C");
        }
        if (A <= 69 && A >= 60) {
            System.out.println("D");
        }
        if (A <= 59) {
            System.out.println("F");
        }

        scanner.close();
    }
}
