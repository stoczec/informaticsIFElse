import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        //Задача №292. Максимум из двух чисел
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a > b ? a : b);
    }
}
