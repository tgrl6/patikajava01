package patika02.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        /*Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara
         göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.

        1-En az 8 karakter içermeli
        2-Space karakteri içermemeli
        3-İlk harf büyük harf olmalı,
        4-Son karakteri ? olmalı*/
        Scanner scanner = new Scanner(System.in);


        String truePassword = "Sonbirkez?";//bir şifre tanımladık

        int denemeSayisimax = 3; //bir sayaç kurduk ki kullanıckac deneme hakkı oldugunu bilsin
        int denemeSayisi;
        for (denemeSayisi = 0; denemeSayisi < denemeSayisimax; denemeSayisi++) { //sayac için bir for dögüsü yaptık


            System.out.println("Lütfen sifrenizi giriniz: ");// şifre aldık ullanıcıdan
            String password = scanner.nextLine();
            if (password.contains(" ")) {// şifre bosluk içeriyormu diye baktık
                System.out.println("Şifrenizde Bosluk bulunmamalıdır."); //hatasını söyledik


            } else if (password.length() != 10) { //şifrenin uzunlugunu belirttik kisa yada fazla olmasın diye

                System.out.println("Sifreniz 10 karakter olmalidir.");

            } else if (password.startsWith("S") && password.endsWith("?") && password.equals(truePassword)) {
                System.out.println("şifreniz dogru, İyi Günler ");
                // idtenen şifre sarlarını belirttik
                break; //eger dogruysa dögüyü sonlandırdık

            } else {

                System.out.println("Yanlış şifre girdiniz, Tekrar deneyiniz"); //hata aldıgımı spyledik kullanıcıya
            }


            System.out.println("kalan denema sayınız: " + (denemeSayisimax - denemeSayisi-1)+"Lütfen 10dk sonra yeniden deneyin" );
            //sayacımızın işlemi burada


        }
    }
}