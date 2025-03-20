package patika02.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTheChar {
    private static Arrays Array;

    public static void main(String[] args) {

        String[] harf = {"a", "b", "c", "d"};
        List<String> harfList = new ArrayList<>(Arrays.asList(harf));
        // burda bizimlistemi immuatable idi bu yuzden bunu degitirdik
        int counter=0;
        while (counter<4) {

            System.out.println("aramak istediginiz karakteri giriniz: ");
            Scanner scanner = new Scanner(System.in);
            String kar = scanner.nextLine();


           while (counter < 4) { // sayac koyduk kı kullanıcı 4 kez denesin
                if (harfList.contains(kar)) {//.contains içerir mi bi bakalım demek
                    System.out.println(harfList);
                    System.out.println("karakterınız listemizde bulunuyor.");
                    harfList.replaceAll(s -> s.equals(kar ) ? "found" : s);
                    System.out.println("guncel listeniz : " + harfList);


                    counter += 1;
                    break;

                } else {
                    System.out.println("karakterinizi listeye ekliyorum.");
                    harfList.add(kar);
                    System.out.println("guncel liste: " + harfList);
                    counter += 1;
                    break;
                }
           }
        }
    }
}
