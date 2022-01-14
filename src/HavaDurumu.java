import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sicaklik;

        System.out.println("Sıcaklığı giriniz : ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak zamanı ");
        } else if (sicaklik >=5 && sicaklik < 15 ) {
            System.out.println("Sinema zamanı");
        } else if (sicaklik >= 15 && sicaklik < 25 ) {
            System.out.println("Piknik zamanı");
        } else {
            System.out.println("Yüzme zamanı");
        }
    }
}
