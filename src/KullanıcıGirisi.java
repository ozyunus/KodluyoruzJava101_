import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String Name= "ad";
        int Password=12345;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz :");
        String nameInput = input.nextLine();
        nameInput = nameInput.toLowerCase();

        System.out.println("Şifreyi Giriniz :");
        int passwordInput = input.nextInt();

        if (Password== passwordInput && Name.equals(nameInput)) {
            System.out.println("Bilgiler Doğru\nGiriş Başarılı");
        }
        else {
            System.out.println("Bilgiler Yanlış\nGiriş Başarısız");
            System.out.println("Bilgiler Yanlış Sıfırlamak ister misiniz ?");
            System.out.println("Evet ise 1\nHayır ise 2");
            int answer= input.nextInt();
            input.nextLine();

            if(answer==1) {
                System.out.print("Kullanıcı Adını Giriniz :");
                String newName= input.nextLine();
                newName=newName.toLowerCase();

                System.out.print("Şifrenizi Giriniz :");
                int newPassword= input.nextInt();

                while ((newName.equals(Name) || newPassword==Password)) {

                    System.out.println("Şifre oluşturulamadı\nLütfen başka şifre ve kullanıcı adı giriniz.");
                    System.out.print("Kullanıcı Adını Giriniz :");
                    newName= input.next();
                    System.out.print("Şifrenizi Giriniz :");
                    newPassword= input.nextInt();
                    System.out.println("Kullanıcı Adı :" +newName + "\nŞifre :"+newPassword);
                    System.out.println("Giriş Başarılı");
                }
                Name = newName;
                Password = newPassword;
                System.out.println("Kullanıcı Adı :" +newName + "\nŞifre :"+newPassword);
                System.out.println("Giriş Başarılı");

            }
            else {
                System.out.println("Kullanıcı Bilgileriniz Hatalı.\nİyi Günler.");
            }
        }

    }
}
