import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar;
        double hipotenus;

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk kenar uzunluğunu giriniz :");
        ilkKenar = scanner.nextInt();

        System.out.println("İkinci kenar uzunluğunu giriniz : ");
        ikinciKenar = scanner.nextInt();

        hipotenus = Math.sqrt(Math.pow(ilkKenar ,2) + Math.pow(ikinciKenar, 2));
        System.out.println("Girilen kenarların hipotenüsü : " + hipotenus);

        int cevreAlanIlkKenar, cevreAlanIkinciKenar, cevreAlanUcüncüKenar;
        int cevre, u;
        double alan;

        System.out.println("Alan ve çevre hesabı için birinci kenar uzunluğunu giriniz : ");
        cevreAlanIlkKenar = scanner.nextInt();

        System.out.println("Alan ve çevre hesabı için ikinci kenar uzunluğunu giriniz : ");
        cevreAlanIkinciKenar = scanner.nextInt();

        System.out.println("Alan ve çevre hesabı için üçüncü kenar uzunluğunu giriniz : ");
        cevreAlanUcüncüKenar = scanner.nextInt();

        u = (cevreAlanIlkKenar + cevreAlanIkinciKenar + cevreAlanUcüncüKenar) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - cevreAlanIlkKenar) * (u - cevreAlanIkinciKenar) * (u - cevreAlanUcüncüKenar));
        System.out.println("Çevre : " + cevre + "\n" + "Alan : " + alan);
    }
}
