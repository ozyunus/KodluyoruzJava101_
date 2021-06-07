import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ücgenin Tabanını giriniz :");
        int Kenar1 = input.nextInt();

        System.out.println("Ücgenin Dik Kenarını giriniz :");
        int Dik = input.nextInt();

        double hipo = (Kenar1*Kenar1)+(Dik*Dik);

        hipo = Math.sqrt(hipo);

        System.out.println("Hipotenüs :" + hipo);
    }
}
