package patika01.odevler;

import java.util.Scanner;

public class verilensayiyakadarçiftbulma {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("bir sayı giriniz: ");   //burası kullanıcıdan deger almak kullandıgımız bir yapıdır.
        int number= scanner.nextInt();

        int toplam = 0;   // burasınıda en sı-on gereklı olan bir degişken oldugu için atamasını yaptık .


        for (int i = 0; i <=number ; i++) {// bu yapı bize verilen deger kadar olan sayıları bu dongunu içine sokar

            if (i%2==0)// bu kosulumuz da hangi sayılkarı sececegimizi bbelirler
            {
                System.out.println(i + " bu bir çift sayıdır.");// sectigimiz sayıları ekrana yazdırır

                toplam = i + toplam;// burasıda toplama işlemimiz
            }



        }System.out.println(toplam);

    }
}
