import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz :");
        sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        sayi2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Fark : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpım : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölüm : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Lütfen 1 ila 4 arasında bir seçim yapınız");
        }
    }
}
