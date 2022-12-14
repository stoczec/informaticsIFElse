import java.util.Scanner;

public class Cow {
    public static void main(String[] args) {
        // Задача №303. Коровы
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 11 || n == 12 || n == 13 || n == 14) {
            System.out.println(n + " korov");
        } else if (n % 10 == 1) {
            System.out.println(n + " korova");
        } else if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4) {
            System.out.println(n + " korovy");
        } else
            System.out.println(n + " korov");
    }
}
