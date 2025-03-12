package patika02.tasks;

import java.util.Scanner;

public class roundingtointeger {
    //Kullanıcının girdiği ondalıklı bir sayıyı aşağı, yukarı ve en yakın tam sayıya yuvarlayarak ekrana yazdıran kodu yazınız.


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("bir sayı giriniz:");

        double sayi= scanner.nextDouble();//bir degişken tanımlıyoruz.

        double asagiyuvarlama=Math.floor(sayi);// burda bir metod yapıoruz aşşagıya yuvarlamak için

        double yukariyuvarlama=Math.ceil(sayi);// burda bir metod yapıoruz yukarı yuvarlamak için

        double enyakintamsayiyayuvarlama=Math.round(sayi);// burda bir metod yapıoruz normal yuvarlamak için


        System.out.println("Aşağı Yuvarlama"+ asagiyuvarlama);// burda methodu cagırıp ekrana yazdırıyoruz

        System.out.println("Yukarı  Yuvarlama"+ yukariyuvarlama);// burda methodu cagırıp ekrana yazdırıyoruz

        System.out.println("En Yakın Tam Sayı:" + enyakintamsayiyayuvarlama);// burda methodu cagırıp ekrana yazdırıyoruz


    }
}
