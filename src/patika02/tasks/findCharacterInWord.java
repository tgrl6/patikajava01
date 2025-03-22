package patika02.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class findCharacterInWord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String word= scanner.nextLine().toLowerCase(); // kelimemızın b7utun harflarını kucuk harf olarak kabul rttık

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(char ch: word.toCharArray() ){
            if( charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+1);


            }else{
                charCountMap.put(ch, 1);

            }
        }


        System.out.println("harfler ve sayıları: " );
        for (char key: charCountMap.keySet()){
            System.out.println(key + ":---:"+ charCountMap.get(key));
        }
        scanner.close();




    }
}
