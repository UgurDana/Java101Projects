import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, r, totalN = 1, totalY = 1, comb;

        System.out.println("N değerini giriniz : ");
        n = scanner.nextInt();
        System.out.println("R değerini giriniz : ");
        r = scanner.nextInt();
        if (r > 0 && n > r) {
            for (int i = n; i > n - r; i--) {
                totalN *= i;
            }

            for (int i = r; i > 0; i--) {
                totalY *= i;
            }
            comb = totalN / totalY;
            System.out.println("Kombinasyon : " + comb);
        } else if (n == r || r == 0) {
            System.out.println(1);
        } else {
            System.out.println("Hatalı veri girişi !");
        }

    }
}
