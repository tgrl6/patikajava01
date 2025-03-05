package patika01;

import java.util.Scanner;

public class aritmetikişlemönceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A sayısını giriniz:" );
        int a = scanner.nextInt();

        System.out.println("B saıysını giriniz:");
        int b = scanner.nextInt();

        System.out.println("Csayısını giriniz:");
        int c = scanner.nextInt();


        int islem= a+b*c-b;
        System.out.println("sonuç:" + islem);
    }
}
