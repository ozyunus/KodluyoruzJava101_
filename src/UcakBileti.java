import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int yas, km,yolculukTipi;
        double normalTutar,indirimliTutar=0,yasIndirimi;
        String Error = "Hatalı Veri Girdiniz.";

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi Km olarak giriniz :");
        km = input.nextInt();
        if (km>0){

        }
        else {
            System.out.println(Error);
        }

        System.out.println("Lütfen Yaşınızı giriniz :");
        yas = input.nextInt();

        if (yas>0){

        }
        else {
            System.out.println(Error);
        }
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Lütfen Yolculuk tipini giriniz :"+"\nTek Yön için 1 i"+"\nGidiş Dönüş için 2 yi seçiniz");
        yolculukTipi = input.nextInt();

        normalTutar = (km*0.1)*yolculukTipi;
        System.out.println("Normal Ücret :"+normalTutar);

        if (yolculukTipi==1){

            if (yas<12){
                indirimliTutar=normalTutar/2;
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }
            else if(yas>=12 && yas<24){
                indirimliTutar=normalTutar-(normalTutar*0.1);
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }
            else if (yas>65) {
                indirimliTutar=normalTutar-(normalTutar*0.3);
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }

        }
        else if(yolculukTipi==2) {
            normalTutar = normalTutar - (normalTutar*0.2);


            if (yas<12){
                indirimliTutar=normalTutar*0.5;
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }


            else if(yas>=12 && yas<24){
                indirimliTutar=normalTutar-(normalTutar*0.1);
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }
            else if (yas>65) {
                indirimliTutar=normalTutar-(normalTutar*0.3);
                System.out.println("İndirimli Ücret :" + indirimliTutar + " tl");
            }
            else
                System.out.println("İndirimli Ücret :" + normalTutar + " tl");

        }




    }
}
