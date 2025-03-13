package patika01;

public class arrays {
    public static void main(String[] args) {
        int number=5;
        int number1 =10;
        int number2=15;

        int[] numbers=new int[8];
        numbers[0]=5;
        numbers[1]=10;
        numbers[2]=15;
        numbers[3]=20;
        numbers[4]=25;
        numbers[6]=30;


        for (int i = 0; i < numbers.length; i++) {
            //System.out.println("number["+i+ "] = " +numbers[i]);

        }
        int [] numbers2={1,2,3,4,5};
         for (int num:numbers2){
            // System.out.println(num);
         }
         String cities[]= {"istanbul", "ankara", "mersin", "urfa" , "antep" , "adana"};
         String[] cities1={"istanbul, ankara, mersin, urfa, antep, adana"};

         for (String city : cities1 ){
        System.out.println(city);
         }






    }

}
