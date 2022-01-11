import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int yaricap;
        double pi = 3.14;
        double aci;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = scanner.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz : ");
        aci = scanner.nextDouble();

        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;

        System.out.println("Yarıçapı " + yaricap + " olan dairenin alanı : " + alan + " çevresi : " + cevre);

        double dilimAlani = (pi * (yaricap * yaricap) * aci) / 360;

        System.out.println("Yarıçapı " + yaricap + " , merkez açısı : " + aci + " derece olan daire dilimini alanı : " + dilimAlani);
    }
}
