package patika02.tasks;

import java.util.*;


public class findclosestone {








    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("kac sayi gireceksiniz: ");
        int n = scanner.nextInt();  //  kullanıcının kac sayı girecegini alıyoruz

        int[] numbers = new int[n]; // bunu da ona gore bir eleman sayısı olan dizi olusturuyoruz

        for (int i = 0; i < n; i++) {  // aldıgımız sayıları eklıyoruyz diziye
            System.out.print("sayı " +(i+1) + ": ");
            numbers[i] = scanner.nextInt();

            //for  ile kullanıcıdan n adet sayı alıyoruz ve diziye ekliyoruz.

        }

        Arrays.sort (numbers);    // metodu, diziyi artarak yazdırır

        // En küçük farkı bulmak için değişkenler

        int minFark = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        // En küçük farkı bulmak için yan yana olan elemanları karşılaştır
        for (int i = 0; i < n - 1; i++) {
            int fark = numbers[i + 1] - numbers[i];

            if (fark < minFark) {  // Eğer yeni fark, daha önce bulduğumuzdan küçükse
                // minFark değişkenini güncelle
                minFark = fark;
                num1 = numbers[i];
                num2 = numbers[i + 1];
            }
        }

        System.out.println("En yakın iki sayı: " + num1 + " ve " + num2);
        System.out.println("Aralarındaki fark: " + minFark);

        scanner.close();















       /* System.out.print("girdiginiz sayılar: ");
        for (int num: numbers){
            System.out.print(num +" ");
        }
        scanner.close(); */

    }
}

