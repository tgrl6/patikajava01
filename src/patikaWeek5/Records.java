package patikaWeek5;

public class Records {
    public static void main(String[] args) {
        Student student1=new Student("ad1","soyad1","123321");
        Student student2 =new Student("ad2","soyad2","123322");
        Student student3 =new Student("ad3","soyad3","123323");
        System.out.println("1.ogenci: "+student1);
        System.out.println("2.ogenci: "+student2);
        System.out.println("3.ogenci: "+student3);
        // equals ve hashCode testleri
        System.out.println("\nstudent1 equals student3? " + student1.equals(student3));
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());

    }
    // Record tanımı
    public record Student(String firstName, String lastName, String studentNumber) {
        // İsteğe bağlı olarak yapıcı veya özel metotlar eklenebilir
    }
}
