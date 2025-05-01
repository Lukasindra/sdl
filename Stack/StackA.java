public class StackA {
    private int[] elemen;   // Array untuk menyimpan data
    private int front;      // Indeks elemen teratas
    private int size;       // Jumlah elemen

    // Constructor default kapasitas 7
    public StackA() {
        elemen = new int[7];
        front = -1;
        size = 0;
    }

    // Constructor dengan ukuran custom
    public StackA(int ukuran) {
        elemen = new int[ukuran];
        front = -1;
        size = 0;
    }

    // Menambahkan elemen ke stack
    public boolean push(int nilai) {
        if (size >= elemen.length) {
            return false; // Stack penuh
        }
        front++;
        elemen[front] = nilai;
        size++;
        return true;
    }

    // Menghapus dan mengembalikan elemen teratas
    public int pop() {
        if (isEmpty()) {
            return -1; // Stack kosong
        }
        int nilai = elemen[front];
        front--;
        size--;
        return nilai;
    }

    // Mengembalikan jumlah elemen
    public int size() {
        return size;
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Menampilkan isi stack
    public String toString() {
        if (isEmpty()) {
            return "Stack kosong";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Isi Stack (dari atas ke bawah):\n");
        sb.append("+-----+\n");
        for (int i = front; i >= 0; i--) {
            sb.append(String.format("| %3d |\n", elemen[i]));
        }
        sb.append("+-----+");
        return sb.toString();
    }
}
