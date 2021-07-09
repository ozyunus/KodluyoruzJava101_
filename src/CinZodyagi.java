import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int birthday;
        String animal="";


        System.out.println("Lütfen Doğum Yılınızı Giriniz :");
        Scanner input = new Scanner(System.in);
        birthday = input.nextInt();

        if(birthday%12==0){
            animal = "maymun";
        }
        else if(birthday%12==1) {
            animal = "Horoz";
        }
        else if(birthday%12==2) {
            animal = "Köpek";
        }
        else if(birthday%12==3) {
            animal = "Domuz";
        }
        else if(birthday%12==4) {
            animal = "Fare";
        }
        else if(birthday%12==5) {
            animal = "Öküz";
        }
        else if(birthday%12==6) {
            animal = "Kaplan";
        }
        else if(birthday%12==7) {
            animal = "Tavşan";
        }
        else if(birthday%12==8) {
            animal = "Ejderha";
        }
        else if(birthday%12==9) {
            animal = "Yılan";
        }
        else if(birthday%12==10) {
            animal = "At";
        }
        else if(birthday%12==11) {
            animal = "Koyun";
        }


        System.out.println("Çin Zodyağı Burcunuz : "+ animal);
    }

}
