package patikaWeek5;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

        public static void main(String[] args) {

            List<String> names = new ArrayList<>();

            names.add("Ahmet");

            names.add("Ayşe");

            names.add("Mehmet");

            names.add("Zeynep");
            //Method reference ile listeyi yazdırma
            names.forEach(System.out::println);

            // Geleneksel yöntemle liste elemanlarını yazdırma
             /*  for (String name : names) {
                System.out.println(name);}*/

        }
}

