import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //Задача №293. Какое из чисел больше?
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b){
            System.out.println(1);
        } else if (b >a) {
            System.out.println(2);
        }else
            System.out.println(0);
    }
}
