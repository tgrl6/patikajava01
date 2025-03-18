package mytry.systemforlibrary;

import java.util.Scanner;

public class atm2 {



    /*Bir ATM simülasyonu yaz. Program aşağıdaki işlemleri yapabilmeli:

    Kullanıcıdan başlangıç bakiyesini al.
    Kullanıcıya şu işlemleri sun:
    Para yatırma
    Para çekme
    Bakiye sorgulama
    Çıkış
    Kullanıcı çıkış yapana kadar işlemleri tekrar et.
    Para çekme işlemi, bakiyeden fazla olmamalı.

    Kullanıcı Girişi:

Kullanıcıdan kart numarası ve şifre alınmalı.++
Eğer bilgiler doğruysa giriş yapmalı, yanlışsa 3 defa deneyebilmeli.++
İşlem Menüsü:
Kullanıcı giriş yaptıktan sonra aşağıdaki işlemleri yapabilmeli:

1) Para Yatırma ++
2) Para Çekme++
3) Bakiye Sorgulama++
4)                                                                         Şifre Değiştirme
5) Çıkış++
Para Çekme Kuralları:

Kullanıcının bakiyesi yetersizse çekim işlemi reddedilmeli.
Günlük para çekme limiti 2000 TL olmalı.++
Şifre Değiştirme:

Kullanıcı eski şifresini doğru girdikten sonra yeni şifresini oluşturabilmeli.
Çıkış:

Kullanıcı çıkış yaptığında "İyi günler dileriz!" mesajı göstermeli ve program kapanmalı.


    */


    public static void main(String[] ignoredArgs) {
        Scanner scanner = new Scanner(System.in);
        int[][] userinfo = {
                {123456789, 1234},
                {987654321, 9876},
                {147852369, 1478},
                {369852147, 3698},
                {789456123, 7894},
        };
        int giriscounter = 0;
        int bakiye = 5000;
        boolean girisBasarili = false;
        int kullaniciIndex = -1;
        while (giriscounter < 3) {
            System.out.println("kart numaranızı giriniz: ");
            int kartno = scanner.nextInt();
            System.out.println("şifrenizi giriniz:");
            int password = scanner.nextInt();


            for (int i = 0; i < userinfo.length; i++) {
                if (userinfo[i][0] == kartno && userinfo[i][1] == password) {
                    girisBasarili = true;
                    kullaniciIndex = i;
                    break;
                }
            }
            if (!girisBasarili) {
                System.out.println("Hatalı giriş! Tekrar deneyin.");
                giriscounter++;
            }
            if (girisBasarili ) {


                boolean islemdevam = true;

                while (islemdevam) {

                    System.out.println("Ne işlem yapmak istiyorsunuz?" +
                            "  1) yatirma" +
                            "   2) cekme" +
                            " 3) sorgulama" +
                            "4) şifre deiştirme" +
                            " 5) çıkış");

                    System.out.println("    " +
                            "işlem numarasını giriniz:1/2/3/4/5");

                    int islemturu = scanner.nextInt();


                    if (islemturu == 1) {
                        System.out.println("yatrıdıgınız mıktar");
                        int amountplus = scanner.nextInt();
                        bakiye += amountplus;
                        System.out.println("yeni bakiyeniz:" + bakiye);


                    } else if (islemturu == 2) {
                        System.out.println("cekmek istediginiz bakiye:");
                        int amountminus = scanner.nextInt();


                        if (amountminus > bakiye) {
                            System.out.println("you cant do that, you dont have enough money for this.");
                        } else if (amountminus > 2000) {
                            System.out.println(" Gülük çekim limtiniz 2000 birimdir");

                        } else {
                            bakiye -= amountminus;
                            System.out.println("kalan bakiyeniz: " + bakiye);
                        }


                    } else if (islemturu == 3) {
                        System.out.println("bakiyeniz: " + bakiye);

                    } else if (islemturu == 4) {
                        System.out.println("sifrenizi giriniz");
                        int oldpassword = scanner.nextInt();
                        if (oldpassword == userinfo[kullaniciIndex][1]) {
                            System.out.println("yeni sifrenizi giriniz");
                            int newpassword = scanner.nextInt();
                            userinfo[kullaniciIndex][1] = newpassword;
                        } else {
                            System.out.println(" Şifreyiniz hatalı !!!");

                        }

                    } else if (islemturu == 5) {
                        System.out.println("İyi günler dileriz");
                        islemdevam = false;


                    } else {
                        System.out.println("yanlış bir işlem sectiniz , Yeniden deneyiniz.");
                    }
                }

            }


            // System.out.println("Bakiyenizi girin:");

            //int amount = scanner.nextInt();

            //bakiye = amount;


        }
    }
}





