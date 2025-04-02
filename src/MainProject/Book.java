package MainProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Book { // bir kitap nesnesi olusturduk
    private static int idCounter = 1; // Her kitap için artan ID
    private int id;
    private String title;//
    private String author;
    private boolean isBorrowed; // sectigimiz kitabın odun alınıp alınmadıgını soyleyecek bize

    public Book(String title, String author) { // constructor yapısı edındık
        this.id = idCounter++; // Her yeni kitap için ID artırılır
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public int getid(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {         // kitabın ödünç alınıp alınmadığını değiştirmek için kullandık
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

}


