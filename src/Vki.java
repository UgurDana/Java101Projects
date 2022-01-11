import java.util.Scanner;
public class Vki {
    public static void main(String[] args) {
        double kilo;
        double boy;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Kilonuz : ");
        kilo=scanner.nextDouble();

        System.out.print("Boyunuz (Metre Cinsinden) : ");
        boy=scanner.nextDouble();

        double Vki= kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + Vki);
    }
}
