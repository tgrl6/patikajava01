package patika01;

import java.util.Scanner;

public class artıkyılhesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yılı giriniz: ");
        int yil= scanner.nextInt();
        int hesap= (yil%4);

        switch(hesap) {
            case 0:
                System.out.println(yil +" bir artık yıldır!");
                break;
            default:
                System.out.println(yil +"  bir artık yıldır değildir!");
        }
    }
}
