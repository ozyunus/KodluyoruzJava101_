import java.util.Scanner;

public class KücüktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1. Sayıyı Giriniz :");
        int num1 = input.nextInt();
        System.out.println("Lütfen 2. Sayıyı Giriniz :");
        int num2 = input.nextInt();
        System.out.println("Lütfen 3. Sayıyı Giriniz :");
        int num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println("num1 < num2 < num3");
            } else {
                System.out.println("num1 < num3 < num2");
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println("num2 < num1 < num3");
            } else {
                System.out.println("num2 < num3 < num1");
            }
        } else if (num3 < num2 && num3 < num1) {
            if (num1 < num2) {
                System.out.println("num3 < num1 < num2");
            } else {
                System.out.println("num3 < num2 < num1");


            }
        }
    }

}
