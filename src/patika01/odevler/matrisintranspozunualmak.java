package patika01.odevler;
import java.util.Scanner;
public class matrisintranspozunualmak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrisin satır değerini giriniz: ");
        int satir = scanner.nextInt();
        System.out.println("Matrisin sütun değerini giriniz: ");
        int sutun = scanner.nextInt();

                int[][] matrix = new int[satir][sutun];
                int[][] tersmatrix = new int[sutun][satir]; // Transpoz matris

                // Matris elemanlarını kullanıcıdan al
                System.out.println("Dizinin elemanlarını girin:");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print("Matris[" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                // Matrisin transpozunu oluştur
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        tersmatrix[j][i] = matrix[i][j];
                    }
                }

                // Orijinal matrisi ekrana yazdır
                System.out.println("Orijinal Matris:");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                // Transpoz matrisi ekrana yazdır
                System.out.println("Transpoz Matris:");
                for (int i = 0; i < sutun; i++) {
                    for (int j = 0; j < satir; j++) {
                        System.out.print(tersmatrix[i][j] + " ");
                    }
                    System.out.println();
                }

                scanner.close();
            }
        }



