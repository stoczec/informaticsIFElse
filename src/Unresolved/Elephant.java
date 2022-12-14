package Unresolved;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        //System.out.println((a != c && b != d) || b - 1 == d || b +1 == d || (a == b && c == d)? "YES" : "NO");
        System.out.println((a + b) == (c + d) || (c + d) - (a + b) == 2 || (c - a) == (d - b) || ((a == b) && (c == d)) ? "YES" : "NO");

    }
}
