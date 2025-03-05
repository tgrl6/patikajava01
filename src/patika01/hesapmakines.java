package patika01;

import java.util.Scanner;

public class hesapmakines {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        double number1 = scanner.nextDouble();
        System.out.println("ikinci sayıyı giriniz: ");
        double number2 = scanner.nextDouble();
        System.out.println("yapmak istediginiz işlemi şeçin : (+,-,*,/):");
        char operation = scanner.next().charAt(0);
       switch (operation) {
           case '+' :
               System.out.println("Sonuç ="+( number1 +number2));
               break;
           case '-':
               System.out.println("Sonuç= 0" +(number1 - number2));
               break;
           case'*':
               System.out.println("Sonuç = " +(number1*number2));
               break;
           case'/':
               if(number2!=0) {
                   System.out.println("Sonuç = " + (number1 / number2));
               }
               else{
                   System.out.println("HATA ---- Bir sayıyı sıfıra bölemezsiniz.---- ");
               }

               break;
           default:
               System.out.println("gecersiz işlem:");
               break;



       }


    }
}
