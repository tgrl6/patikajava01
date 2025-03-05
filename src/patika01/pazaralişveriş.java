package patika01;

import java.util.Scanner;

public class pazaralişveriş {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac kilo Armut aldınız? :");
        double armut = scanner.nextDouble();

        System.out.println("Kac kilo Elma aldınız? :");
        double elma = scanner.nextDouble();

        System.out.println("Kac kilo Domates aldınız? :");
        double domates = scanner.nextDouble();

        System.out.println("Kac kilo Muz aldınız? :");
        double muz = scanner.nextDouble();

        System.out.println("Kac kilo Patlıcan aldınız? :");
        double patlican = scanner.nextDouble();
        double tutar = (armut*214/100 + elma*367/100 + domates*111/100 + muz*95/100 + patlican*5);
        System.out.println("Toplam Tutar :" + tutar);
        scanner.close();
    }
}
