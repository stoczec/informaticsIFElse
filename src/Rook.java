import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        //Задача №254. Ладья
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(a == c || b == d ? "YES" : "NO");

    }
}
