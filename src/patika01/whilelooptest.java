package patika01;
 import java.util.Scanner;
public class whilelooptest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="1234";
        while (true){
            System.out.println("şirenizi giriniz: ");
            String input= scanner.nextLine();

            if (password.equals(input)){
                System.out.println("Şifre doğru!");
                break ;
            }else{
                System.out.println("Yeniden Deneyiniz ");
            }
        }

    }
}
