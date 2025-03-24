package patika02.tasks;

public class GenericMetotTask {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        // Integer dizisi
        Integer[] intArray = {2023, 2023, 2011, 2020, 2014};
        System.out.println(" Türkiyede olan deprem yılları:");
        printArray(intArray);

        // String dizisi
        String[] strArray = {"Pazarcık, Kahramanmaraş", "Elbistan, Kahramanmaraş", "Tabanlı, Van", "Ege Denizi","Ege Denizi Gökçeada açıkları" };
        System.out.println("Depremin bölgesi:");
        printArray(strArray);

        // Double dizisi
        Double[] doubleArray = {7.8, 7.5, 7.2, 7.0, 6.9};
        System.out.println("Dempremin şiddeti:");
        printArray(doubleArray);
    }
}
