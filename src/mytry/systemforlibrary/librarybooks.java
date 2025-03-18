package mytry.systemforlibrary;

import java.util.ArrayList;

public class librarybooks {


    public static class Library {
        ArrayList<Book> books = new ArrayList<>();  // Kitapları saklayacak liste

        // Kitap ekleme metodu
        public void addBook(Book book) {
            books.add(book);  // Listeye kitap ekler
        }

        // Kitapları yazdırma metodu
        public void printBooks() {
            for (Book book : books) {
                System.out.println(book);  // Kitap bilgilerini yazdırır
            }
        }
    }

}



/*
    Proje Başlığı: Kütüphane Yönetim Sistemi
Proje Tanımı:
Bu proje, bir kütüphane için kitap ve üyelik takibini yapabilecek bir uygulama oluşturmayı amaçlamaktadır. Kullanıcılar kitapları kiralayabilir,
 iade edebilir, kitapları arayabilir ve üyelik bilgilerini yönetebilir. Ayrıca, sistemdeki kitapların durumları (kirada, mevcut) takip edilebilir.

Proje Gereksinimleri:
Kütüphane Kitapları:

Kütüphanede bulunan kitaplar listelenebilir. Her kitabın adı, yazarı, ISBN numarası, yayınevi, basım yılı ve kitap türü gibi bilgileri olacaktır.
Kitapların durumları takip edilecektir (kirada, mevcut).
Kullanıcılar kitapları arama özelliği ile arayabilirler. Arama kriteri kitap adı, yazar, tür veya ISBN olabilir.
Üyelik Sistemi:

Kütüphaneye üye olan kullanıcılar, kitapları kiralayabilir ve iade edebilirler.
Her üyenin ad, soyad, üyelik numarası, telefon numarası, adres gibi bilgileri saklanmalıdır.
Üyeler kiralık kitaplarını takip edebilir. Kiralanan kitaplar, kullanıcı tarafından belirtilen süre boyunca kirada olarak işaretlenir.
Kitap Kiralama ve İade İşlemleri:

Kullanıcılar, kütüphanedeki mevcut kitapları kiralayabilir. Kiralama işlemi, kullanıcıya ait kitapların listesine eklenir.
Kitaplar, iade edilene kadar kirada olarak işaretlenir.
Kullanıcılar, kiraladıkları kitapları iade edebilir. İade edilen kitap, kütüphanedeki mevcut kitaplar arasına geri döner.
Kitap Durumu Takibi:

Kitaplar, mevcut ve kirada olmak üzere iki farklı durumda tutulabilir.
Kullanıcılar, kitapları kiralamadan önce kitapların durumlarını kontrol edebilir.
Ödünç Verme Süresi ve Geç İade:

Kiralanan kitaplar için ödünç verme süresi (örneğin, 15 gün) belirlenmelidir.
Süresi geçmeyen kitaplar normal şekilde iade edilirken, süresi geçen kitaplar için geç iade ücreti uygulanabilir.
Kitap Ekleme ve Silme:

Kütüphaneye yeni kitaplar eklenebilir. Kitap eklerken, tüm bilgilerin girilmesi zorunludur.
Kitaplar silinebilir ancak, kirada olan bir kitap silinemez.
Proje Şartları:
Teknolojiler:

Programlama Dili: Java
Veritabanı: Basit dosya işlemleri veya diziler/ArrayList'ler kullanılabilir.
Kullanıcı Arayüzü: Konsol tabanlı bir arayüz olacaktır. (İsteğe bağlı olarak GUI eklenebilir.)
Yapılacak İşlemler:

Kitapları listeleme, arama ve ekleme işlemleri yapılabilir.
Üyelik işlemleri (yeni üye kaydı, üyelik bilgisi güncelleme) yapılmalıdır.
Kitap kiralama ve iade işlemleri yapılacaktır.
Kitap durumları kontrol edilecek (kirada, mevcut).
Performans ve Kullanıcı Dostu Tasarım:

Kullanıcı dostu bir menü yapısı olmalıdır. Kullanıcılar, işlemleri kolayca yapabilmelidir.
Hata mesajları açık ve anlaşılır olmalıdır.
Test ve Doğrulama:

Kitap ekleme, silme, kiralama ve iade işlemleri doğru bir şekilde çalışmalıdır.
Üyelik işlemleri, kitap kiralama süresi ve geç iade ücretleri test edilmelidir.
Proje Teslim Şartları:
Kod ve Dosya Teslimi:

Projenin Java kaynak kodu (.java dosyaları) teslim edilmelidir.
Proje dokümantasyonu, önemli fonksiyonların açıklamaları ve kullanım talimatları da eklenmelidir.
Proje Teslim Süresi:

Projenin teslim süresi 2 hafta olarak belirlenmiştir.
Projenin teslim tarihi ve zamanına uyulmalıdır.
Ekstra Özellikler (İsteğe Bağlı):
GUI (Graphical User Interface): Eğer GUI eklemek istersen, Swing veya JavaFX kullanarak kitapların ve üyelerin listelendiği, kiralama işlemlerinin yapıldığı görsel bir arayüz oluşturabilirsin.

Kitap Geçmişi: Her kitabın kira geçmişi tutulabilir, böylece hangi kitaplar en çok kiralanmış gibi bilgilere ulaşılabilir.

Bu proje ile, Java'nın temel özelliklerini kullanarak nesne yönelimli programlamanın temellerini öğrenebilir ve gerçek dünya problemleri için çözümler geliştirebilirsin. Kitaplar, üyeler ve kiralama işlemleri gibi nesneleri birbirleriyle etkileşime giren şekilde tasarlayarak uygulamanı geliştirebilirsin.*/


