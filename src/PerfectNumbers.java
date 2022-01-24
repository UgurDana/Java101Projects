import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.println("Sayıyı giriniz :");
        sayi = scanner.nextInt();
        for (int i = 1; i < sayi; i++) {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(toplam != 1 && toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
