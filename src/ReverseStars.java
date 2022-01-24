import java.util.Scanner;
public class ReverseStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi;
        System.out.println("Basamak sayısını giriniz : ");
        basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
