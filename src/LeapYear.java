import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Задача №253. Високосный год
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "YES" : "NO");
    }
}
