package patika01;
import java.sql.SQLOutput;
import java.util.Scanner;

public class circlecalculater  {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz: ");
        double radius= scanner.nextDouble();
        double PI = 3.14159;
        double area = PI*radius*radius;
        double circumference = 2*PI*radius;

        double area2 = Math.PI*radius*radius;
        double circumference2 = 2*Math.PI*radius;
        System.out.println("daireini alanı: "+ area +"-" + area2);
        System.out.println("dairenin cevresi: " + circumference +"-" + circumference2 );



    }
}
