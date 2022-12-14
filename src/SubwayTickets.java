import java.util.Scanner;

public class SubwayTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(129 % 60);
        System.out.println(35 % 60);
// на одну поездку билет выгодно брать - <=8
// на десять поездок билет выгодно брать - <=3

        int ticketOne = 15;
        int ticketTen = 125;
        int ticketSixty = 440;

        if (n % 60 == 0) {
            System.out.println(0 + " " + 0 + " " + n / 60);
        } else if (n % 60 <= 8) {
            System.out.println(n % 60 + " " + 0 + " " + n / 60);
        } else if (n % 60 == 9) {
            System.out.println(0 + " " + 1 + " " + n / 60);
        } else if (n % 60 > 10) {
            System.out.println(0 + " " + 1 + " " + n / 60);
        }
    }
}
