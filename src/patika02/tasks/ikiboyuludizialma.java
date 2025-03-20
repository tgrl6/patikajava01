package patika02.tasks;

import java.util.Scanner;


public class ikiboyuludizialma {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Satır ve sütun sayısını al
        System.out.print("Kaç satır olacak? ");
        int rows = scanner.nextInt();

        System.out.print("Kaç sütun olacak? ");
        int cols = scanner.nextInt();

        // 2 boyutlu dizi oluştur
        int[][] numbers = new int[rows][cols];

        // Kullanıcıdan 2D dizi elemanlarını alma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Sayı [" + (i + 1) + "][" + (j + 1) + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Kaç satır olacak? ");
        int rows1 = scanner.nextInt();

        System.out.print("Kaç sütun olacak? ");
        int cols1 = scanner.nextInt();
        scanner.nextLine(); // Boş satırı temizle

        // 2 boyutlu String dizisi oluştur
        String[][] words = new String[rows][cols];

        // Kullanıcıdan 2D dizi elemanlarını alma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Kelime [" + (i + 1) + "][" + (j + 1) + "]: ");
                words[i][j] = scanner.nextLine(); // String giriş al
            }
        }

        // Girilen 2D diziyi ekrana yazdır
        System.out.println("\nGirilen Matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(words[i][j] + "\t");
            }
            System.out.println(); // Yeni satıra geç
        }


        // Girilen 2D diziyi ekrana yazdır
        System.out.println("\nGirilen Matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println(); // Yeni satıra geç
        }

        scanner.close();
    }
}

