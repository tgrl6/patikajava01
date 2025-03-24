package patika02.tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMapTask {

    public static void main(String[] args) {
        Map< String, Integer> point = new HashMap<>();
       // Map< String, Integer> point = new LinkedHashMap<>();
        //Map< String, Integer> point = new TreeMap<>();


        point.put("game of thorenes",98);
        point.put("breaking bad",78);
        point.put("vikings",88);
        point.put("sense8",99);
        point.put("kurtlar vadisi",95);
        point.put("adanalı",78);
        point.put("the rescuit",90);
        point.put("spartacus",88);



        for (Map.Entry<String,Integer> entry: point.entrySet()){
            System.out.println(entry.getKey()+ " = " + entry.getValue());
        }

    }


}
