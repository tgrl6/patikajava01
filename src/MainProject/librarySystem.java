package MainProject;
import java.util.ArrayList;
import java.util.Scanner;


import static MainProject.Library.*;


public class librarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        addDefaultBooks(books);// benim eklediğim kitaplar

        boolean running = true;   // sistemden cıkısı almak için gereken kosulu sagladık

        while (running) {
            System.out.println("Welcome to Library System");
            printMenu();


            int choice = scanner.nextInt(); // kullanıcıdan gelen cevaba göre caseler olusturduk

            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner, books);
                    break;
                case 2:
                    listBook(scanner, books);
                    break;
                case 3:
                    searchBook(scanner,books);
                    break;
                case 4:
                    borrowBook(books);
                    break;
                case 5:
                    returnBook(scanner, books);
                    break;
                case 6:
                    System.out.println("Have Good Day");
                    running = false; // bu deger boolean degişkenimizi degiştir bu sayede cıkıs yapmıs oluruz
                    break;
                default:
                    System.out.println("WRONG CHOICE, Try Again");
            }
        }
    }
}