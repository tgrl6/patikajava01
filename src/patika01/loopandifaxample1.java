package patika01;

import java.util.Scanner;

public class loopandifaxample1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("Bu sayı pozitiftir." + number);
        }else if (number<0){
            System.out.println("Bu sayı negatiftir." + number );

        }else{
            System.out.println("Bu sayı sıfırdır. "+ number );
        }



    }
}
