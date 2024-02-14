import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        ArrayList<Integer> arrA = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            arrA.add(X+Y);
        }

        for (int i = 0; i < A; i++) {
            System.out.println(arrA.get(i));
        }

        scanner.close();
    }
}
