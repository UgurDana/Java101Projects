import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int miktar, max = 0, min = 0;
        System.out.println("Girilecek sayı adedini giriniz : ");
        miktar = scanner.nextInt();
        for (int i = 1; i <= miktar; i++) {
            System.out.println(i + " . sayıyı giriniz : ");
            int sayi = scanner.nextInt();
            if(i == 1) {
                max = sayi;
                min = sayi;
            }

            if(min > sayi) {
                min = sayi;
            }
            if(max < sayi) {
                max = sayi;
            }
        }

        System.out.println("Minimum sayi : " + min);
        System.out.println("Maksimum sayi : " + max);
    }
}
