import java.util.Scanner;

public class FlyTickets {
    public static void main(String[] args) {
        double
                perKm = 0.10,
                onIkiKucuk = 0.5,
                onUcYirmiDort = 0.1,
                altmisBesBüyük = 0.3,
                gidisDonus = 0.2,
                normalTutar,
                yasIndirimi = 0,
                indirimliTutar,
                gdIndirimi = 0,
                toplamTutar;
        int
                yolculukTip,
                yas,
                mesafe;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz : ");
        mesafe = scanner.nextInt();
        System.out.println("Yaşınızı giriniz :");
        yas = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => tek yön, 2=> gidiş-dönüş)");
        yolculukTip = scanner.nextInt();

        if(mesafe >= 0 && yas >= 0) {
            if(yolculukTip == 1 || yolculukTip == 2) {
                normalTutar = mesafe * perKm;
                if(yas < 12) {
                    yasIndirimi = normalTutar * onIkiKucuk;
                } else if(yas >= 13 && yas <= 24) {
                    yasIndirimi = normalTutar * onUcYirmiDort;
                } else if(yas >= 65) {
                    yasIndirimi = normalTutar * altmisBesBüyük;
                }
                indirimliTutar = normalTutar - yasIndirimi;

                if(yolculukTip == 2) {
                    gdIndirimi = indirimliTutar * gidisDonus;
                    toplamTutar = (indirimliTutar - gdIndirimi) * 2;
                    System.out.println("Toplam tutar : " + toplamTutar + " TL");
                } else {
                    toplamTutar = (indirimliTutar - gdIndirimi);
                    System.out.println("Toplam tutar : " + toplamTutar + " TL");
                }
            } else {
                System.out.println("Lütfen yolculuk tipini doğru seçiniz!! (1 veya 2)");
            }
        } else {
            System.out.println("Yaş ve/ veya mesafe 0'dan küçük olamaz !!");
        }
    }
}
