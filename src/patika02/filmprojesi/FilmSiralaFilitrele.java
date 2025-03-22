package patika02.filmprojesi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSiralaFilitrele {
        public static void main(String[] args) {
            List<Film> filmler = Arrays.asList(
                    new Film("Inception", 2010, "Bilim Kurgu", 8.8),
                    new Film("The Dark Knight", 2008, "Aksiyon", 9.0),
                    new Film("Interstellar", 2014, "Bilim Kurgu", 8.6),
                    new Film("Parasite", 2019, "Dram", 8.6),
                    new Film("The Godfather", 1972, "Suç", 9.2)
            );


            System.out.println("\nIMDb Puanına Göre Sıralama:");  // IMDb puanına göre büyükten küçüğe sıralama
            filmler.stream()
                    .sorted(Comparator.comparingDouble(Film::getImdb).reversed())  // Büyükten küçüğe sıralama
                    .forEach(System.out::println); //yazdır


            System.out.println("\nYayın Yılına Göre Sıralama:");
            filmler.stream()
                    .sorted(Comparator.comparingInt(Film::getYil)) // Yayın yılına göre küçükten büyüğe sıralama
                    .forEach(System.out::println);

            // Belirli bir türe göre filtreleme
            filtreleTureGore(filmler, "Bilim Kurgu");
        }

        public static void filtreleTureGore(List<Film> filmler, String tur) {
            System.out.println("\n'" + tur + "' türündeki filmler:");
            List<Film> filtrelenmis = filmler.stream()
                    .filter(film -> film.getTur().equalsIgnoreCase(tur))
                    .collect(Collectors.toList());

            filtrelenmis.forEach(System.out::println);
        }
    }


