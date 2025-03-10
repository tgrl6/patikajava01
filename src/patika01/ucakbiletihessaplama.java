package patika01;

import java.util.Scanner;

public class ucakbiletihessaplama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.print("mesafeyi KM türünden  giriniz :");
        km = scan.nextInt();
        System.out.print("yasınızı giriniz : ");
        yas = scan.nextInt();
        System.out.print(" Yolculuk tipini seçiniz: (1=tek gidiş , 2=gidiş dönüş) :");tip = scan.nextInt();

        double normalfiyat,yasindirimi,tipindirimi;

            if(km > 0 && yas> 0 &&(tip==1 || tip==2) ) {
                normalfiyat = km*0.10;
                if(yas<12) {
                    yasindirimi = normalfiyat*0.5 ;
                } else if (12 <= yas && yas<=24){
                    yasindirimi = normalfiyat*0.10 ;
                } else if (yas> 65) {
                    yasindirimi= normalfiyat*0.3;
                }else {yasindirimi= 0;}

                normalfiyat-=yasindirimi;
                if(tip==2){
                    tipindirimi= normalfiyat*0.2;
                    normalfiyat= 2*(normalfiyat- tipindirimi);
                }
                System.out.print("bilet tutarı:" + normalfiyat+ "€");
            }else{
                System.out.print("girdiler yanlış. ");
            }


        }
    }


