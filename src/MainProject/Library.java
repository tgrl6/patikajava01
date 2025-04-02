package MainProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    //Kullanıcı hangi işlemleri yapabileceğini gösteren bir ekran ile karşılanmalıdır. +++
    public static void printMenu(){
        System.out.println("\nWhat do you want to do:  ");

// kullanıcını menusunu ayarladık
        System.out.println("1 = To add new books to the library");//Kütüphaneye yeni kitaplar eklemek
        System.out.println("2 = To borrow a book");//Kütüphanedeki tüm kitapları görüntülemek
        System.out.println("3 = To search for a book by title");//Başlığa göre kitap aramak
        System.out.println("4 = To list all the books in the library");//Kitap ödünç almak
        System.out.println("5 = To return a book ");//Kitap iade etmek
        System.out.println("6 = Exit ");// çıkış
    }
    // Önceden kütüphaneye eklediğim kitaplar.
    public static void addDefaultBooks(ArrayList<Book> books) {
        books.add(new Book("A Game Of Thrones", " George RR Martin"));
        books.add(new Book("The Colour Of Magic", " Terry Pratchett"));
        books.add(new Book("The Lord of the Rings ", " J. R. R. Tolkien"));
        books.add(new Book("Jonathan Strange & Mr Norrell", " Susanna Clarke "));
        books.add(new Book("The Kingkiller Chronicle", " Patrick Rothfuss"));
        books.add(new Book("The Lies of Locke Lamora", " Scott Lynch"));
        books.add(new Book("American Gods", " Neil Gaiman "));
        books.add(new Book("The Fifth Season", " NK Jemisin "));
        books.add(new Book("The Earthsea Quartet", " Ursula Le Guin"));
        books.add(new Book("Assassin's Apprentice", " Robin Hobb"));
    }

    //Kullanıcı terminal ekranı aracılığı ile kütüphaneye yeni kitaplar ekleyebilmelidir. +++
    public static void addBook(Scanner scanner, ArrayList<Book> books) {// Kitap eklemek için bir method yazdık
        System.out.print("Book Name: ");
        String title = scanner.nextLine();
        System.out.print("Author Name: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("The book was added successfully.");
    }

    //Kullanıcı terminal ekranı aracılığı ile kütüphanedeki mevcut kitapları listeleyebilmelidir.+++
    public static void borrowBook(ArrayList<Book> books) { //olusturdugumuz listeyi ekrana yazdırmak için kullandık
        if (books.isEmpty()) {
            System.out.println("There are no books registered in the library.");
            return;
        }
        System.out.println("\n Books in Our Collection:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "(The book you're looking for has been borrowed.)" : "(The book you searched for is currently available)";
            System.out.println(book.getid() +"---"+ book.getTitle() + "---" + book.getAuthor() + "---" + status);
        }
    }

    //Kullanıcı kitap ismine göre arama yapabilmelidir.+++
    public static void searchBook(Scanner scanner, ArrayList<Book> books) {
        System.out.print("Please enter the book title you're looking for:");
        String searchTitle = scanner.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                String status = book.isBorrowed() ? "(The book you're looking for has been borrowed.)" : "(The book you searched for is currently available)";
                System.out.println("🔍 Book Found: " + book.getTitle() + " | " + book.getAuthor() + " " + status);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with that title.");
        }
    }

    //Kullanıcı mevcut bir kitabu ödünç alabilmelidir.+++
    public static void listBook(Scanner scanner, ArrayList<Book> books) {
        System.out.println("Available Books: ");
        int availableCount = 0;
        for (int i = 0; i < books.size(); i++) {// for dongusu butun kıtapları kontrol eder
            if (!books.get(i).isBorrowed()) { //istenilen kitabın daha once ondunc alınmadıgını kontrol eder
                availableCount++;
                System.out.println((i + 1) + " - " + books.get(i).getTitle() + " (" + books.get(i).getAuthor() + ")");
            }
        }

        if (availableCount == 0) { // butun kıtaplar odunc alındıysa kı mevzu bu
            System.out.println("No books are currently available for checkout.");
            return;
        }

        System.out.print("Enter the ID/number of the book you wish to borrow: ");//
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > books.size() || books.get(choice - 1).isBorrowed()) {
            System.out.println("Invalid selection!");
            return;
        }

        books.get(choice - 1).borrowBook();
        System.out.println(books.get(choice - 1).getTitle() + " The book has been checked out");
    }

    //Kullanıcı ödünç aldığı bir kitabı iade edebilmelidir.+++
    public static void returnBook(Scanner scanner, ArrayList<Book> books) {
        System.out.print("Enter the name of the book you want to return: ");
        String title = scanner.nextLine();

        for (Book book : books ) { // for each kullanrak books daki butun nesneleri kontrol eder
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) { // bu kullanıcını  verdigi deger iler listemizdeki degerleri kıyaslar
                book.returnBook();
                System.out.println(title + " The book has been returned successfully.");
                return;
            }
        }
        System.out.println("This book is not checked out or cannot be found!");
    }

}
