import java.util.Scanner;
public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,password,choose;

        System.out.println("Kullanıcı adınızı giriniz :");
        username = scanner.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = scanner.nextLine();

        if(password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else {
            System.out.println("Şifreniz yanlış ! \n Şifrenizi sıfırlamak ister misiniz ? [Y/N]");
            choose = scanner.nextLine();
            if(choose.equals("Y")) {
                System.out.println("Yeni oluşturulacak şifreyi giriniz : (Not: Eski şifrenizle aynı olmamalı!)");
                password = scanner.nextLine();
                if(password.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı. Lütfen tekrar deneyiniz!");
                } else {
                    System.out.println("Şifre oluşturuldu !");
                }
            } else {
                System.out.println("Çıkış !");
            }
        }
    }
}
