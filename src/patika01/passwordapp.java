package patika01;

import java.util.Scanner ;

public class passwordapp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String password = "1234";
        boolean ispasswordfalse = true;
        int counter = 0 ;
        do {
            System.out.println("şifre giriniz:");
            String input= scanner.nextLine();

            if (password.equals(input)){
                System.out.println("şifre dogru.");
                ispasswordfalse= false;


            }else {
                System.out.println("yanlış bir şifre girdiniz.");
                ispasswordfalse=true;
                counter++;;

            }
        }while (ispasswordfalse&&  counter<3);
    }
}
