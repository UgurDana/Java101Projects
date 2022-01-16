import java.util.Scanner;
public class DortVeBesKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Bir sayi giriniz : ");
        number = scanner.nextInt();
        for(int i = 1, k = 1; i<=number || k <=number; i *= 4,k *=5) {
            if(i != 1)
                System.out.println(i);
            System.out.println(k);
        }
    }
}
