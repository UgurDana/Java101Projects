import java.util.Scanner;
public class Asal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asalMi;

        System.out.println("1 ile 100 arasındaki asal sayılar");
        for (int i = 2 ; i <= 100; i++) {
            asalMi = false;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    asalMi = true;
                    break;
                }
            }
            if(!asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
