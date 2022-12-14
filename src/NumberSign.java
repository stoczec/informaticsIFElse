import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        //Задача №2959. Знак числа
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num > 0){
            System.out.println(1);
        } else if (num < 0) {
            System.out.println(-1);
        }else
            System.out.println(0);
    }
}
