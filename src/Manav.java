import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double alinanArmut, alinanElma, alinanDomates, alinanMuz, alinanPatlican;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double toplam;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldınız ?");
        alinanArmut = scanner.nextDouble();

        System.out.println("Kaç kilo elma aldınız ?");
        alinanElma = scanner.nextDouble();

        System.out.println("Kaç kilo domates aldınız ?");
        alinanDomates = scanner.nextDouble();

        System.out.println("Kaç kilo muz aldınız ?");
        alinanMuz = scanner.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız ?");
        alinanPatlican = scanner.nextDouble();

        toplam = (alinanArmut * armut) + (alinanElma * elma) + (alinanDomates * domates) + (alinanMuz * muz) + (alinanPatlican * patlican);
        System.out.println("Toplam pazar tutarınız : " + toplam + " TL");
    }
}
