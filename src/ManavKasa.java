import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç armut kg aldınız ? :");
        double armut = input.nextDouble();

        System.out.println("Kaç kg elma aldınız ? :");
        double elma = input.nextDouble();

        System.out.println("Kaç kg domates aldınız ? :");
        double domates = input.nextDouble();

        System.out.println("Kaç kg muz aldınız ? :");
        double muz = input.nextDouble();

        System.out.println("Kaç kg patlıcan aldınız ? :");
        double patlican = input.nextDouble();

        armut = armut * 2.14;
        elma  = elma * 3.67;
        domates = domates * 1.11;
        muz = muz * 0.95;
        patlican = patlican * 5.0;

        double tutar = armut + elma + domates + muz + patlican;

        System.out.println("Toplam tutar :" + tutar);


    }

}
