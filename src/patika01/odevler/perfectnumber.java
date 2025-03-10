package patika01.odevler;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int number= scanner.nextInt();

        int bolenler = 0;
        for (int i = 1; i <number ; i++) {
            if (number%i==0){
                System.out.println(i);
                bolenler +=i;


            }

        }
        if (bolenler==number){
            System.out.println(number +"  Bu bir mükemmel sayıdır.");
        }
        else{
            System.out.println(number+ "  Bu bir mükemmel sayı degildir.");
        }
    }
}
