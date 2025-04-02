package tuncerhoca;

import java.util.ArrayList;
import java.util.Scanner;

public class carrentalSystem {
    public static void main(String[] args) {
        //menu karsılasın
        // secenekler
        //1 areac ekle 2 arac kırala 3 ıade 4 arac listele  5 cıkıs
        //komut satırından bılgı al
        //cıkıs secıolmez ise uygulama calısmay  devam edecek
        System.out.println(" arac kiralamay hosgeldınız");
        Scanner scanner =new Scanner(System.in);
        boolean running =true;
       ArrayList<Car> cars = new ArrayList<>();

        while( running){
            printMenu();

            int choice= scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    addcar(scanner, cars);
                    break;
                case 2:
                    availebleCar(cars, scanner);
                    break;
                case 3:
                    returnCar(scanner, cars);
                    break;
                case 4:
                    listCar(cars);
                    break;
                case 5:
                    System.out.println("iyi gunler , tekrar beklariz");
                    running= false;
                    break;
                default:
                    System.out.println("yanlıs giriş yaptınız" );


            }

        }


    }

    private static void listCar(ArrayList<Car> cars) {
        for (Car car : cars){
            if (car != null){
                System.out.println(car.getPlate() + "---palkalı arac sıstemde kayıtlı ");
            }

        }
        System.out.println(" sistemdeki araclar listelendi");
    }

    private static void returnCar(Scanner scanner, ArrayList<Car> cars) {
        System.out.println(" iade etmek istediginiz aracın plakasını gırınız");
        String plaka = scanner.nextLine();
        for (Car car:  cars){
            if (car.getPlate().equals(plaka)){
                car.setRented(false);
            }
        }

        System.out.println(" arac iade islemi basarı ıle tamamlandı");
    }

    private static void availebleCar(ArrayList<Car> cars, Scanner scanner) {
        System.out.println(" musait aracalar.");
        int index= 1;
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println((index) + " : " + car.getPlate());
            }
            index++;
        }
        int secim=scanner.nextInt();
        scanner.nextLine();
        System.out.println(cars.get(secim-1 ).getPlate()+"  aracı basarı ile kiraladınız");


    }

    private static void addcar(Scanner scanner, ArrayList<Car> cars) {
        System.out.println(" arac plakası gırınız: ");
        String plate = scanner.nextLine();
        Car car =new Car();
        car.setPlate(plate);
        car.setRented(false);
        cars.add(car);

        System.out.println("arac ekleme işi basarılıdır. ");
    }

    private static void printMenu() {
        System.out.println("\nyapmak istedıgınız işlemi şeciniz: ");

        System.out.println("1 = arac ekleme ");
        System.out.println("2 = arac kıralama ");
        System.out.println("3 = arac iade ");
        System.out.println("4 = arac listeleme ");
        System.out.println("5 = cıkıs ");
    }
}
