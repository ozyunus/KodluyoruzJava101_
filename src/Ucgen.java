import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.Kenar Uzunluğunu giriniz :");
        int kenar1 = input.nextInt();

        System.out.println("Lütfen 2.Kenar Uzunluğunu giriniz :");
        int kenar2 = input.nextInt();

        System.out.println("Lütfen 3.Kenar Uzunluğunu giriniz :");
        int kenar3 = input.nextInt();

        double cevre = (kenar1+kenar2+kenar3)/2;

        double alan = Math.sqrt(cevre*(cevre-kenar1)*(cevre-kenar2)*(cevre-kenar3));

        System.out.println("Üçgenin Alanı :" + alan);

    }

}

