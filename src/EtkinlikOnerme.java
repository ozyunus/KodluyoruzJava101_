import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Hava Sıcaklığını Giriniz :");
        double heat = input.nextDouble();

        if (heat>0 && heat<5)
            System.out.println("Kayak için güzel bir hava");
        else if (heat>=5 && heat<=10)
            System.out.println("Sinema güzel olur");
        else if (heat>10 && heat<=15)
            System.out.println("Sinema veya Piknik için ideal hava, kararsız kaldım :)");
        else if (heat>15 && heat<=25)
            System.out.println("Tam piknik havası");
        else
            System.out.println("Bu havada ne yüzülür :) ");

    }
}
