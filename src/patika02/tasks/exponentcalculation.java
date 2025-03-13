package patika02.tasks;

import java.util.Scanner;

public class exponentcalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban sayısını giriniz:");
        int sayi1= scanner.nextInt();
        System.out.println("ÜS sayısını giriniz:");
        int sayi2= scanner.nextInt();

        double sonuc = kuvvetAlma(sayi1, sayi2);
        System.out.println("Sonuç: " + sonuc);

    }
    public static double kuvvetAlma(int sayi1, int sayi2 ){
        if ((sayi1==0 ) && (sayi2==0)){
            System.out.println(" Sıfırın sıfırncı kuvveti birdir.");
            return 1;

        } else if ((sayi1==0) && (sayi2 !=0)){
            //System.out.println("sonuç: 0 ");
            return 0;

        }else{
            double sonuc= 1;
            for (int i = 0; i <sayi2 ; i++) {
                sonuc *= sayi1;

            }
            return sonuc;

        }


    }



}

