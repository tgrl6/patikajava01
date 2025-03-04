package jave.deneme01;
import java.util.Scanner;


public class bodycountcalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("kilonuzu giriniz: ");
        double kilo= scanner.nextDouble();


        System.out.println("Boyunuzu Giriniz (cm) : ");
        double boy = scanner.nextDouble();

        double bodycount = kilo/(boy*boy) *10000;


        System.out.println("vucuk kıtle endeksiniz:  " + bodycount);
        scanner.close();
    }
}
