import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        double harmonik = 0;
        System.out.println("Harmonik ortalaması bulunacak sayiyi giriniz ");
        sayi = scanner.nextInt();

        for (double i = 1.0; i <= sayi; i++ ) {
            harmonik += (1 / i);
        }
        System.out.println(sayi + " sayısının harmonik ortalaması : " + harmonik);
    }
}
