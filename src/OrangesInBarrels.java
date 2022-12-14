import java.util.Scanner;

public class OrangesInBarrels {
    public static void main(String[] args) {
        // Задача №1448. Апельсины бочками
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0 || (n >= 5 && n <= 20) || (n % 10 >= 5) || (n >= 20 && n % 10 == 0) || (n % 100 == 11)) {
            System.out.println(n + " bochek");
        } else if (n % 10 == 1) {
            System.out.println(n + " bochka");
        } else
            System.out.println(n + " bochki");
    }
}
