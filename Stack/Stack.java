public class Stack {
    private int[] data;       // Array untuk menyimpan elemen stack
    private int front;          // Indeks elemen teratas
    private int jumlahData;   // Jumlah elemen dalam stack

    // Constructor default dengan kapasitas 7
    public Stack() {
        data = new int[7];
        front = -1;
        jumlahData = 0;
    }

    // Constructor dengan kapasitas custom
    public Stack(int kapasitas) {
        data = new int[kapasitas];
        front = -1;
        jumlahData = 0;
    }

    // Menambahkan elemen ke atas stack
    public boolean push(int nilai) {
        if (jumlahData >= data.length) {
            return false; // Stack penuh
        }
        front++;
        data[front] = nilai;
        jumlahData++;
        return true;
    }

    // Menghapus dan mengembalikan elemen teratas dari stack
    public int pop() {
        if (isEmpty()) {
            return -1; // Stack kosong
        }
        int nilai = data[front];
        front--; 
        jumlahData--;
        return nilai;
    }

    // Mengembalikan jumlah elemen dalam stack
    public int size() {
        return jumlahData;
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return jumlahData == 0;
    }

    // Menampilkan isi stack dari atas ke bawah dalam format kolom
    public String toStringAtasKeBawah() {
        if (isEmpty()) {
            return "Stack kosong";
        }

        StringBuilder tampil = new StringBuilder("Isi Stack (dari atas ke bawah):\n");
        tampil.append("+-----+\n");
        for (int i = front; i >= 0; i--) {
            tampil.append(String.format("| %3d |\n", data[i]));
        }
        tampil.append("+-----+");
        return tampil.toString();
    }
}
