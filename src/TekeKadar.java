import java.util.Scanner;

public class TekeKadar {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz : ");
            number = scanner.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
            //koşul gerçekleştiği sürece while koşuluna girmez.
        } while (number % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}
