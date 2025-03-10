package patika01.odevler;

import java.util.Scanner;

public class üçevedörtebölünensayitoplam {
    public static void main(String[] args) {// bizden verilen sayıya kadar, 3ve 4 e blöümünden kalan 0 olanların toplamı isteniyor
// 3ve 4 e blöümünden sıfır kalan demek 12 ye bölümünden sıfır kalan demek oldu için 12 bölümünü kullanacagız.

        Scanner scanner =new Scanner(System.in);// bu satır kullanıcan nir giriş almak kullanılan yapının temelidir

        System.out.println("Bir sayı giriniz");//bu satır kullanıcan nir giriş almak içinkullanılır

        int sayi = scanner.nextInt(); // verilen sayımızı yani input u bir degişkene atadık kii işlem yaparken kullanalım

        int toplam = 0;// en sonda bize toplam deger için lazım olan degişkenimiz

        for (int i = 0; i <= sayi; i++) { //verilen sayıya kadar bir bir arttıran yapımız budur.

            if (i%12==0){// bize 12 ye bölümünden kalanın 0 olan sayıları bulur.

                System.out.println(i+ " Bu sayı 3 ve 4 e tam bölendir."); // bu sayıları yazdırır

                toplam = i+toplam; //ve burası da onları toplar
            }

        }System.out.println("  Bu sayıların toplamı:  " +toplam +" dır");// buras isen en son cıkan sonucu yazdırır.

    }
}
