import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        boolean sonuc;
        String durum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = scanner.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        sonuc = (ortalama > 60);
        durum = (sonuc) ? "Geçti" : "Kaldı";
        System.out.println("Ortalama : " + ortalama + "\n" + "Durum : " + durum);
    }
}
