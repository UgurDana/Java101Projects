import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int taban, us, total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");
        taban = scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        us = scanner.nextInt();

        for (int i = 1; i <= us; i++) {
            total *= taban;
        }
        System.out.println("Sonuç : " + total);
    }
}
