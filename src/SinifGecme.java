import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int toplamNot=0;
            double ortalama=0;
            System.out.println("Matematik Notunuzu giriniz :");
            int math = input.nextInt();
            System.out.println("Fizik Notunuzu giriniz :");
            int fizik = input.nextInt();
            System.out.println("Türkçe Notunuzu giriniz :");
            int turkce = input.nextInt();
            System.out.println("Kimya Notunuzu giriniz :");
            int kimya = input.nextInt();
            System.out.println("Müzik Notunuzu giriniz :");
            int muzik = input.nextInt();

            if(math>0 && math<=100)
            toplamNot+=math;
            if(fizik>0 && fizik<=100)
            toplamNot+=fizik;
            if(turkce>0 && turkce<=100)
            toplamNot+=turkce;
            if(kimya>0 && kimya<=100)
            toplamNot+=kimya;
            if(muzik>0 && muzik<=100)
            toplamNot+=muzik;

            ortalama = toplamNot / 5;

            if (ortalama<55) {
                System.out.println("Kaldı.  Not :" + ortalama);
            }
            else
                System.out.println("Geçti Not :" + ortalama);




    }
}
