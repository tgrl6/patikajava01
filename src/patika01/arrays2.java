package patika01;

public class arrays2 {
    public static void main(String[] args) {
        int[] numbers={ 1, 4, 55, 64, 7655, 45, 76,};
        int max= numbers[0];

        for(int number: numbers ){

            if(number>max){
                max =number;

            }
        }
        System.out.println(max);
    }
}
