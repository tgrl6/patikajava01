package patika02.tasks;

import java.util.Scanner;

public class FindTheWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kac adet kelime gireceksiniz: ");
        int n= scanner.nextInt();

        String[] words= new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("1. kelimeniz"+ (i+1) + ":");
            words[i] = scanner.nextLine();

        }




    }
}
