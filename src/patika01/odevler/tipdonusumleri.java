package patika01.odevler;

import java.util.Scanner;

public class tipdonusumleri {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz"); //kullanıcıdan bir tamsayı degeri alıyoruz
        int tamsayi= scanner.nextInt();

        System.out.println("bir ondalıklı sayı giriniz");//kullanıcıdan bir ondalıklı sayı degeri alıyoruz
        double ondaliklisayi = scanner.nextDouble();

        System.out.println("dönüştürmeden önce sizin tam sayınız: "+ tamsayi+ " sizinondalıklı sayınız: "+ ondaliklisayi); //kontrol ediyoruz

        double tamsayi1= tamsayi;  //cevirme işlemini yapıyoruz
        int ondaliklisaiyi1=(int) ondaliklisayi;
        System.out.println("Dönüştürülmüş sekide 1.degerimiz: "+ tamsayi1+" 2.degerimiz: " + ondaliklisaiyi1); //sonucuyazdırıyoruz


        //double myDouble = myInt;
        //int myInt = (int) myDouble; // Explicit dönüşüm double'dan int'e
    }

}
