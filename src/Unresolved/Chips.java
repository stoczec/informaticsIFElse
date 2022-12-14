package Unresolved;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //int a =
        if (number > 0 && number % 2 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
