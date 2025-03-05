package patika01;


import java.util.Scanner;

public class zodyakyilihesaplama {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz:  ");
        int yil = scanner.nextInt();
        int zodyakindex = (yil% 12);

        String name = switch (zodyakindex) {

            case 0->"Maymun";
            case 1->"Horoz";
            case 2->"Köpek";
            case 3->"Domuz";
            case 4->"Fare";
            case 5->"Öküz";
            case 6->"Kaplan";
            case 7->"Tavşan";
            case 8->"Ejderha";
            case 9->"Yılan";
            case 10->"At";
            case 11->"Koyun";
            default -> "HATA";
        };
        System.out.println(name);




    }
}
