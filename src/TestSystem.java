import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        //Задача №2960. Тестирующая система
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((b == 1 && a == 1) || (b != 1 && a != 1) ? "YES" : "NO");
    }
}
