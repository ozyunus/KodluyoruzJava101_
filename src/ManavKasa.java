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
        System.out.println("Armut "+ armut );

        elma  = elma * 3.67;
        System.out.println("Elma "+ elma );

        domates = domates * 1.11;
        System.out.println("Domates "+ domates );

        muz = muz * 0.95;
        System.out.println("Muz "+ muz );

        patlican = patlican * 5.0;
        System.out.println("Patlıcan "+ patlican );

        double tutar = armut + elma + domates + muz + patlican;

        System.out.println("Toplam tutar :" + tutar);


    }

}
