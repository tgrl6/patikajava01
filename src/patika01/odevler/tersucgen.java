package patika01.odevler;

import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir basmak sayısı giriniz.");
        int bs= scanner.nextInt();
        //fibonacci serisi 0,1,,1,2,3,5,8,13,,,,, son iki sayını toplamı seklinde ilerler


        for (int i = bs;  0<i ; i--) {

            for (int x = 0 ; x<(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
