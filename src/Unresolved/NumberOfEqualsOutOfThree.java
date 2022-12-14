package Unresolved;

import java.util.Scanner;

public class NumberOfEqualsOutOfThree {
    public static void main(String[] args) {
        //Задача №296. Количество равных из трех

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println(3);
        } else if (a == b || b == c || a == c) {
            System.out.println(2);
        }else System.out.println(0);
    }
}
