import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        //Задача №294. Максимум из трех
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c){
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        }else
            System.out.println(c);
    }
}
