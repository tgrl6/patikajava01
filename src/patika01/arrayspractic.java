package patika01;

import java.util.Scanner;

public class arrayspractic {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("kac elemanlı bir dizi gireceksiniz" );
        int size= scanner.nextInt();

        int[] numbers= new int[size];
        System.out.println(size+ "adet sayı giriniz");


        for (int i = 0; i < size; i++) {
            System.out.println((i+1)+ ". sayıyı giriniz:");
            numbers[i]=scanner.nextInt();


        }
        int min=numbers[0];
        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max =numbers[i];
            }
            if (min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println("minimum degeriniz :" + min+",maksimum degeriniz :"+max);



    }
}
