public class TernaryOperator {
    public static void main(String[] args) {

        int a = 9;
        int b = 7;

        String sonuc = a>b ? "A büyük" : "B büyük";
        int sonucInt = a>b ? a+b : a*b;
        boolean sonucBool = a>b;

        System.out.println("Sonuc :" +sonuc);
        System.out.println("Sonuc işlem :" +sonucInt);
        System.out.println("Boolean :"+sonucBool);

    }
}
