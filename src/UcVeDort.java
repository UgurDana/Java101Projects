import java.util.Scanner;
public class UcVeDort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, number;
        double average;

        System.out.println("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }
        average = sum / count;
        System.out.println("Ortalama : " + average);
    }
}
