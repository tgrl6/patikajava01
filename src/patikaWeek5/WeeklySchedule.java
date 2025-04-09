package patikaWeek5;

import java.util.Scanner;


public class WeeklySchedule {
    // Enum sınıfı
    public enum Day {
        SUNDAY("Kapalı"),
        MONDAY("09:00 - 16:00"),
        TUESDAY("09:00 - 16:00"),
        WEDNESDAY("09:00 - 16:00"),
        THURSDAY("09:00 - 16:00"),
        FRIDAY("09:00 - 16:00");

        private final String workingHours;

        Day(String workingHours) {
            this.workingHours = workingHours;
        }

        public String getWorkingHours() {
            return workingHours;
        }
        }

    // Kullanıcıdan gün alıp çalışma saatlerini gösteren metot
    public static void showWorkingHours(String inputDay) {
            inputDay = inputDay.toUpperCase();
            if (inputDay.equals("SUNDAY") || inputDay.equals("MONDAY") || inputDay.equals("TUESDAY") ||
                    inputDay.equals("WEDNESDAY") || inputDay.equals("THURSDAY") || inputDay.equals("FRIDAY")) {
                Day day = Day.valueOf(inputDay);
                System.out.println(day + " günü çalışma saatleri: " + day.getWorkingHours());
            } else {
                System.out.println("Geçersiz gün girdiniz. Lütfen geçerli bir gün adı girin (örneğin: MONDAY).");
            }


    }

    // Ana metot
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün giriniz (örnek: MONDAY): ");
        String inputDay = scanner.nextLine();
        showWorkingHours(inputDay);
        scanner.close();
    }
}
