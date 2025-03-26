package patika02.tasks.MakeYourOwnListClass;

public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    // Varsayılan başlangıç boyutu 10
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    // Kullanıcının belirttiği kapasite ile başlatma
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    // Eleman sayısını döndürür
    public int size() {
        return this.size;
    }

    // Kapasiteyi döndürür
    public int getCapacity() {
        return this.capacity;
    }

    // Yeni eleman ekleme metodu
    public void add(T data) {
        if (size >= capacity) {
            expandCapacity();
        }
        array[size++] = data;
    }

    // Kapasiteyi 2 katına çıkarır
    private void expandCapacity() {
        this.capacity *= 2;
        T[] newArray = (T[]) new Object[this.capacity];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array = newArray;
    }

    // Belirtilen indisteki elemanı döndürür, geçersiz indis için null döndürür
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    // Belirtilen indisteki elemanı siler ve diziyi kaydırır, geçersiz indis için null döndürür
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return removedData;
    }

    // Belirtilen indisteki veriyi değiştirir, geçersiz indis için null döndürür
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        array[index] = data;
        return data;
    }

    // Belirtilen nesnenin indeksini döndürür, yoksa -1
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Belirtilen nesnenin son indeksini döndürür, yoksa -1
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Liste boş mu kontrolü
    public boolean isEmpty() {
        return size == 0;
    }

    // Listeyi bir diziye çevirir
    public T[] toArray() {
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    // Listeyi temizler
    public void clear() {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // Belirtilen aralıktaki alt listeyi döndürür
    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size || start > finish) {
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    // Belirtilen nesnenin listede olup olmadığını kontrol eder
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Dizideki elemanları listeleyen metot
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}












