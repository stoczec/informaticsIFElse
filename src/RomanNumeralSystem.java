import java.util.Scanner;

public class RomanNumeralSystem {
    public static void main(String[] args) {
        //Задача №1459. Римская система счисления

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x = findCapacity(number);

        String[] arrOne = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] arrTwo = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        if (x == 1) {
            System.out.println(arrOne[number]);
        } else if (x == 2 && number % 10 > 0) {
            System.out.println(arrTwo[number / 10] + arrOne[number % 10]);
        } else if (x == 2) {
            System.out.println(arrTwo[number / 10]);
        } else System.out.println("C");
    }


    public static int findCapacity(int number) {
        int x;
        if (number >= 0 && number < 10) {
            x = 1;
        } else if (number > 9 && number < 100) {
            x = 2;
        } else x = 3;

        return x;
    }
}
