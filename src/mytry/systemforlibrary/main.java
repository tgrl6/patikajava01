package mytry.systemforlibrary;

public class main { public static void main(String[] args) {
    librarybooks.Library library = new librarybooks.Library();  // Kütüphane nesnesi oluşturuluyor

    // Kitap nesneleri oluşturuluyor
    Book book1 = new Book("Java Programming", "John Doe", 123456,"olimpos",1998,"action");
    Book book2 = new Book("Python Basics", "Jane Smith", 654321 ,"olimpos",1998,"action");

    // Kitaplar kütüphaneye ekleniyor
    library.addBook(book1);
    library.addBook(book2);


    Book book3 = new Book("sevda", "mahmut" ,321564,"olimpos",1998,"action");
    Book book4 = new Book("ali ayseyi seviyor","ali kınık ", 654231,"olimpos",1998,"action");

    library.addBook(book3);
    library.addBook(book4);






    // Kitapları yazdırıyoruz
    library.printBooks();

}
}

