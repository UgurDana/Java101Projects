import java.util.Scanner;

public class RecFibonacci {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seriSayisi;
        System.out.println("Fibonacci seri sayısını giriniz : ");
        seriSayisi = scanner.nextInt();
        System.out.println("Sonuç : " + fib(seriSayisi));
    }
}
