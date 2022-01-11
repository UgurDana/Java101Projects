import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar, kdv18 = 0.18, kdv08 = 0.08;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ücreti giriniz");
        tutar = scanner.nextDouble();

        double kdvTutari = tutar <= 0 ? 0 : (tutar > 0 && tutar <= 1000 ? kdv18: kdv08  );
        System.out.println(tutar <= 0 ? "Tutar 0 dan küçük olamaz" : (tutar > 0 && tutar <= 1000 ? tutar + ( tutar * kdv18 ): tutar+(tutar * kdv08)  ));

        System.out.println("KDV'siz tutar ; " + tutar);
        System.out.print("KDV tutarı ; " + kdvTutari );
    }
}
