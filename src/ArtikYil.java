import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil = scanner.nextInt();

        if(yil % 100 == 0 && yil % 400 == 0){
            System.out.println(yil + " yılı artık yıldır ");
        }
        else if(yil % 4 == 0 && yil % 100 != 0){
            System.out.println(yil + " yılı artık yıldır ");
        }
        else{
            System.out.println(yil + " yılı artık yıl değildir ");
        }
    }
}
