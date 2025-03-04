package jave.deneme01;
import java.util.Scanner;
public class tepmratureexample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("santigrant cinsicnden girin: ");
        double santigrant =  scanner.nextDouble();
        double fahreneit= (santigrant*9/5+32 );
        System.out.println(fahreneit);

    }
}
