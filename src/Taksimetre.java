import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {
        int km;
        double perKm = 2.20;
        double amount = 10.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilometreyi giriniz :");
        km = scanner.nextInt();

        amount = (km < 5) ? 20 : amount + (perKm * km);

        System.out.println(km + " kilometreye vereceğiniz ücret : " + amount);
    }

}
