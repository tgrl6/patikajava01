package patika02.tasks;

import java.util.Scanner;

public class recusiveAsalsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = scanner.nextInt();





        if (islem(number, 2)) {
            System.out.println(number + "  Sayınız asal sayıdır");
        }else{
            System.out.println(number + "Sayınız asal sayı deildir");
        }


    }
    /* asal  sayı olaması için 3 sart vardır
    sadece kadine bölümünen kalan 0 olacak
    1 e bölümünden kalan sıfır olacak
    baska sayılara bölümünden kalan 0 olmayacak
    2 bir asal sayıdır

     */

    public static boolean islem(int number, int bolen) {
        if (number<2) return false;
        if (number==bolen) return true;
        if (number%bolen==0) return false;
        return islem(number,bolen+1);


    }



}
