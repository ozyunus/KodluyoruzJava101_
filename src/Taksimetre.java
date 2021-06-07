import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        int kisaMesafe = 20;
        int acilisUcreti = 10;
        double kmUcreti = 2.20;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen km giriniz : ");
        km = girdi.nextInt();

        double ucret = (km * kmUcreti + acilisUcreti);

        if (ucret<=20){
            System.out.println("Kısa Mesafe Ücreti :"+ kisaMesafe + " tl") ;
        }
        else {

            System.out.println("Borcunuz : " + ucret +" tl");
        }

    }
}
