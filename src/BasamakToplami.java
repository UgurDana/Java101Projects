import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        int toplam = 0, sayi, geciciSayi, basamakSayisi = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        sayi = scanner.nextInt();
        while (sayi != 0) {
            geciciSayi = sayi % 10;
            sayi /= 10;
            toplam += geciciSayi;
        }
        System.out.println("Basamaklar toplamı : " + toplam);
    }
}
