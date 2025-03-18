package patika02;

public class Calculation {
    public void shoeTitle(){
        System.out.println("Hoş Geldiniz!");
    }
    public int calculateSquare(int number){

        int sum1=  number*number;
        System.out.println(sum1);
        return sum1;

    }
    private void addNumbers(int number1, int number2){
        int sum = number1+number2;
        System.out.println("toplam: "+ sum);
    }
    /*private duoble addNumbers(double number1, double number2){
        double sum = number1 + number2;
        // return number1+ number2
        return sum;
    }*/
}
