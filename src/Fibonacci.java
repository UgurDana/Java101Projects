import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int sayi1 = 0, sayi2 = 1, sayi3 = 0, sinir;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını giriniz :");
        sinir = scanner.nextInt();
        System.out.print(sayi1 + " " + sayi2 + " ");
        for (int i = 2; i <= sinir; i++) {
            sayi3 = sayi2 + sayi1;
            System.out.print(sayi3 + " ");
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
    }
}
