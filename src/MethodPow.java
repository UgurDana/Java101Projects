import java.util.Scanner;

public class MethodPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        System.out.println("Taban değerini giriniz : ");
        base = scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        exponent = scanner.nextInt();
        System.out.println("Sonuç : " + pow(base, exponent));
    }

    static int pow(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}
