import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ana parayı giriniz :");
        double anaPara = input.nextDouble();

        double kdv8  = 0.08;
        double kdv18 = 0.18;
        double kdv;

        double kdvliFiyat;
        double kdvTutari;

        if (anaPara <= 1000) {
            kdv = kdv18;
        }
        else {
            kdv = kdv8;
        }
        kdvTutari = anaPara*kdv;
        double sonuc = kdvTutari+anaPara;

        System.out.println("KDV'siz Fiyat :" + anaPara);
        System.out.println("KDV'li Fiyat :"  + sonuc);
        System.out.println("KDV Tutarı :" + kdvTutari);



    }
}
