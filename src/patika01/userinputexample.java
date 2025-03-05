package patika01;

import java.util.Scanner;

public class userinputexample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("adınızı gırınız: ");
        String name = scanner.nextLine();
        System.out.print(" yasınızı giriniz: " );
        int age = scanner.nextInt();
        System.out.println( "merhaba "+  name+ ","+ age +" yasındasın");
        scanner.close();


    }

}
