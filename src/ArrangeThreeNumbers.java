import java.util.Scanner;

public class ArrangeThreeNumbers {
    public static void main(String[] args) {
        // Задача №2961. Упорядочить три числа
        int a = scan();
        int b = scan();
        int c = scan();

        if (a <= b && a <= c && b <= c) {
            System.out.println(a + " " + b + " " + c);
        }else if (a <= b && a <= c && c <= b){
            System.out.println(a + " " + c + " " + b);
        }


    }

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}