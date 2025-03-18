package patika02;

public class factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("factorial: "+ factorial);


    }
    public static int factorial(int number1){
        if (number1==0){
                return 1;
        }
        return number1 * (factorial(number1-1));

        }



}
