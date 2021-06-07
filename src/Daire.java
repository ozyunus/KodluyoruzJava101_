import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yarı çapı giriniz :");
        double r = input.nextDouble();
        double pi = 3.1415;

        double alan = pi * r * r;
        System.out.println("Alan : " + alan);

        double cevre = 2 * pi * r;
        System.out.println("Çevre : " + cevre);
    }
}


