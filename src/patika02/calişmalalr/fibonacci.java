package patika02.calişmalalr;

public class fibonacci {
    public static void main(String[] args) {
        int fibonacci = fibonacci(18);
        System.out.println("Fibonacci(9): " + fibonacci);

    }

    //0,1,1,2,3,5,8,13,,,,,, son iki sayısını toplamı
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;

        } else if (number == 1) {
            return 1;

        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);

        }


    }
}

