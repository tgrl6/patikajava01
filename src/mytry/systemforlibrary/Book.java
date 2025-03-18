package mytry.systemforlibrary;

public class Book{
    public String name;
    public String author;
    public int isbn ;
    public String publishingHouse;
    public int birthYear;
    public String type;



    public Book(String name, String author, int isbn, String publishingHouse, int birthYear,String type) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.publishingHouse = publishingHouse;
        this.birthYear = birthYear;
        this.type = type;
    }

    public Book() {
        
    }

    @Override
    public String toString() {
        return STR."Kitap Adı: \{name}, Yazar: \{author}, ISBN: \{isbn}YayınEvi \{publishingHouse}yayın yılı: \{birthYear}Türü:\{type}";
         
    }


}
