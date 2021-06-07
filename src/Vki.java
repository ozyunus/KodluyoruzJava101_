import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz :");
        int kg = input.nextInt();

        System.out.print("Lütfen boyunuzu giriniz (metre cinsinden) :");
        double size = input.nextDouble();

        double vki = kg/(size*size);

        System.out.println("Vücut Kitle Endeksiniz :" + vki);

    }
}
