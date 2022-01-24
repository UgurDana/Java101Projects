import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi;

        System.out.print("Basamak sayısını giriniz  :");
        basamakSayisi = scanner.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {
            for (int j = basamakSayisi; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = basamakSayisi - 1; i > 0; i--) {
            for (int j = basamakSayisi; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * (i - 1)) + 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

