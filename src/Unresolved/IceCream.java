package Unresolved;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0 || number % 5 == 0 || number % 8 == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

}
