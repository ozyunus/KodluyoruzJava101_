import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.Sayıyı Giriniz :");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen 2.Sayıyı Giriniz :");
        int sayi2 = input.nextInt();

        System.out.println("Lütfen işlem Giriniz :");
        //System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Toplama için : 1");
        System.out.println("Çıkarma için : 2");
        System.out.println("Bölme için : 3");
        System.out.println("Çarpma için : 4");
        int islem = input.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("Toplam :" +(sayi1+sayi2));
                break;

            case 2 :
                System.out.println("Çıkarma :" +(sayi1-sayi2));
                break;

            case 4 :
                System.out.println("Çarpım :" +(sayi1*sayi2));
                break;
            case 3 :
                System.out.println("Bölüm :"+ (sayi1/sayi2));
                break;

            default:
                System.out.println(" Boş ");



        }


    }
}
