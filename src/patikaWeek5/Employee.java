package patikaWeek5;

public class Employee{//Employee adında dış sınıf oluşturun
    private String  firstName;
    private  String lastName;
    private  ContactInfo contactInfo;

    public Employee(String firstName, String lastName, String phone , String email ) {// ve içinde çalışan adı, soyadı gibi bilgileri tutum.
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = this.new ContactInfo(phone, email);
    }
    public class ContactInfo {//ContactInfo adında iç sınıf (Inner Class) oluşturdum
        private String phoneNumber;
        private String emailAddress;

        public ContactInfo(String phoneNumber, String emailAddress) {//ve çalışanların iletişim bilgilerini (telefon ve e-posta) tutum.
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        public String getContactDetails() {
            return "Telefon: " + phoneNumber + " , e-Posta:" + emailAddress;
        }
    }
    public void displayEmployeeInfo (){
        System.out.println("ad: "+ firstName);
        System.out.println("soyad: "+lastName);
        System.out.println( "İletişim Bilgileri:  "+ contactInfo.getContactDetails());
    }

    public static void main(String[] args) {//Employee sınıfı içinde ContactInfo iç sınıfını kullanarak bir çalışanın iletişim bilgilerini gösterecek bir metot yazım.
        Employee employee = new Employee("Tugrul","kurt","5522772754", "krt1881@gmail.com");
        employee.displayEmployeeInfo();
    }

}