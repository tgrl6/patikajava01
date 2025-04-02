package projelerim.systemforlibrary;

import java.util.Scanner;

public class asdfg  {
    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {  // Optimizasyon: n'in kareköküne kadar kontrol et
            if (n % i == 0) return false;  // Eğer böleni varsa asal değildir
        }
        return true;
    }

    // N’inci asal sayıyı bulan fonksiyon
    public static int findNthPrime(int num) {
        int count = 0;  // Kaçıncı asal sayıyı bulduğumuzu takip eder
        int number = 1; // Kontrol etmeye başlayacağımız sayı

        while (count < num) { // num kadar asal sayı bulana kadar devam et
            number++;
            if (isPrime(number)) {
                count++; // Her asal bulduğumuzda sayacı artır
            }
        }
        return number; // num'uncu asal sayıyı döndür
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı gırınız:");
        int num = scanner.nextInt();
   ;
        System.out.println(num + ". asal sayı: " + findNthPrime(num));  // Çıktı: 53
    }
}

