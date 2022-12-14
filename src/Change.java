import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        // Задача №262. Сдача
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int e = c - a;
        int f = d - b;

        if (f < 0){
            f = 100 - Math.abs(f);
            e = e - 1;
        }
        System.out.println(e + " " + f);



    }
}
