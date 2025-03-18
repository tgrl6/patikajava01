package projeler.ornekler;

public class secondclass {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.id=1;
        product1.name="asus";
        product1.unitprice=15000;
        product1.info="16 gb ram";


        Product product2=new Product();
        product2.id=2;
        product2.name="asus";
        product2.unitprice=18000;
        product2.info="32 gb ram";



        Product product3=new Product();
        product3.id=3;
        product3.name="asus";
        product3.unitprice=25000;
        product3.info="64 gb ram";



        Product product4=new Product();
        product4.id=4;
        product4.name="";
        product4.unitprice=35000;
        product4.info="16 gb ram+4050ti";



        Product [] products={product1,product2,product3,product4};
        for (Product produsct : products){
            System.out.println(product1.name);

        }
        System.out.println(products.length);




    }
}
