package patika01;

import java.util.Scanner;

public class loopsandexample2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        //4!= 4*3*2*1
        System.out.println("bir sayı giriniz:");
        int number= scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial=factorial*i;


        }
        System.out.println(number +"!= " + factorial);
    }
}
