import java.util.Scanner;

public class CoordinateQuartes {
    public static void main(String[] args) {
        //Задача №266. Координатные четверти
        Scanner scanner = new Scanner(System.in);
        int xOne = scanner.nextInt();
        int yOne = scanner.nextInt();
        int xTwo = scanner.nextInt();
        int yTwo = scanner.nextInt();

        if (xOne > 0 && yOne > 0 && xTwo > 0 && yTwo > 0){
            System.out.println("YES");
        } else if (xOne > 0 && yOne < 0 && xTwo > 0 && yTwo < 0) {
            System.out.println("YES");
        }else if (xOne < 0 && yOne < 0 && xTwo < 0 && yTwo < 0){
            System.out.println("YES");
        }else if (xOne < 0 && yOne > 0 && xTwo < 0 && yTwo > 0){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
