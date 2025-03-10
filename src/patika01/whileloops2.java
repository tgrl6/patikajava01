package patika01;

public class whileloops2 {
    public static void main(String[] args) {

        int i=0;
        int sum=0;
        while (i<100){
            if (i%5==0) {
                System.out.println(i+" degeri hesaba dahil degildir.");
                i++;
                continue;

            }
            System.out.println(i+"  i:degeri");
            sum+=i;
            i++;

        }
        System.out.println("toplam=" +sum);

    }
}
