package Unresolved;

import java.util.Scanner;

public class Cutlets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();


        if (k == n && k > 1) {
            System.out.println(m * 2);
        } else if (k % 2 == 0 && n % 2 == 0 && n > 2) {
            System.out.println((m * 2) + ((n - k) * 10));
        } else if (n % k != 0 ) {
            System.out.println(((n / k) * (m * 2)) + (m * 2) );
        }else if (k == 1 && n == 1){
            System.out.println(m * 2);
        }
            
        }
    }