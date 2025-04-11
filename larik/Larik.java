package com.mycompany.larik;

public class Larik {

    // Metode untuk mencetak elemen-elemen array ke layar
    public static void cetak(int[] data) {
        for (int i = 0; i < data.length; i++) { // Loop untuk menampilkan setiap elemen array
            System.out.print(data[i] + " "); // Cetak elemen diikuti dengan spasi
        }
        System.out.println(); // Ganti baris setelah mencetak semua elemen
    }

    // Metode Sequential Search untuk mencari elemen dalam array secara linear
    public static int sequentialSearch(int[] larik, int kunci) {
        for (int i = 0; i < larik.length; i++) { // Loop dari indeks 0 hingga akhir array
            if (larik[i] == kunci) { // Jika elemen saat ini sama dengan kunci yang dicari
                return i; // Kembalikan indeks elemen yang ditemukan
            }
        }
        return -1; // Jika elemen tidak ditemukan, kembalikan -1
    }

    // Metode Binary Search (hanya bisa digunakan pada array yang sudah terurut)
    public static int binarySearch(int[] larik, int x) {
        int indekAwal = 0; // Indeks awal array
        int indekAkhir = larik.length - 1; // Indeks akhir array

        while (indekAwal <= indekAkhir) { // Selama indeks awal tidak melewati indeks akhir
            int indekTengah = indekAwal + (indekAkhir - indekAwal) / 2; // Hitung indeks tengah

            if (larik[indekTengah] == x) { // Jika elemen tengah adalah elemen yang dicari
                return indekTengah; // Kembalikan indeks tengah
            }

            if (larik[indekTengah] > x) { // Jika elemen tengah lebih besar dari elemen yang dicari
                indekAkhir = indekTengah - 1; // Pindahkan batas atas ke kiri
            } else { // Jika elemen tengah lebih kecil dari elemen yang dicari
                indekAwal = indekTengah + 1; // Pindahkan batas bawah ke kanan
            }
        }
        return -1; // Jika elemen tidak ditemukan, kembalikan -1
    }

    // Metode Interpolation Search (hanya bisa digunakan pada array yang sudah terurut dan memiliki distribusi nilai yang merata)
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1; // Tentukan batas awal dan akhir pencarian

        while (low <= high && key >= arr[low] && key <= arr[high]) { // Selama kunci berada dalam rentang array
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]); // Hitung posisi perkiraan

            if (arr[pos] == key) { // Jika elemen yang ditemukan sama dengan kunci
                return pos; // Kembalikan indeks elemen
            }

            if (arr[pos] < key) { // Jika nilai di posisi lebih kecil dari kunci
                low = pos + 1; // Pindahkan batas bawah ke kanan
            } else { // Jika nilai di posisi lebih besar dari kunci
                high = pos - 1; // Pindahkan batas atas ke kiri
            }
        }
        return -1; // Jika elemen tidak ditemukan, kembalikan -1
    }

    // Metode Bubble Sort untuk mengurutkan array secara ascending (menaik)
    public static void bubbleSortAscending(int[] larik) {
        for (int iterasi = 0; iterasi < larik.length - 1; iterasi++) { // Loop untuk iterasi sorting
            for (int elemen = 0; elemen < larik.length - 1 - iterasi; elemen++) { // Loop untuk membandingkan elemen
                if (larik[elemen] > larik[elemen + 1]) { // Jika elemen lebih besar dari elemen berikutnya, tukar posisi
                    int temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }
            }
        }
    }

    // Metode Bubble Sort untuk mengurutkan array secara descending (menurun)
    public static void bubbleSortDescending(int[] larik) {
        for (int iterasi = 0; iterasi < larik.length - 1; iterasi++) { // Loop untuk iterasi sorting
            for (int elemen = 0; elemen < larik.length - 1 - iterasi; elemen++) { // Loop untuk membandingkan elemen
                if (larik[elemen] < larik[elemen + 1]) { // Jika elemen lebih kecil dari elemen berikutnya, tukar posisi
                    int temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }
            }
        }
    }

    // Metode Selection Sort untuk mengurutkan array secara ascending (menaik)
    public static void selectionSortAscending(int[] larik) {
        int N = larik.length; // Menyimpan panjang array
        for (int iterasi = 0; iterasi < N - 1; iterasi++) { // Loop untuk iterasi sorting
            int minIndex = iterasi; // Inisialisasi indeks elemen terkecil
            for (int elemen = iterasi + 1; elemen < N; elemen++) { // Loop mencari elemen terkecil
                if (larik[elemen] < larik[minIndex]) { // Jika ditemukan elemen lebih kecil, perbarui minIndex
                    minIndex = elemen;
                }
            }
            // Menukar elemen terkecil dengan elemen pertama pada iterasi ini
            int temp = larik[iterasi];
            larik[iterasi] = larik[minIndex];
            larik[minIndex] = temp;
        }
    }

    // Metode Selection Sort untuk mengurutkan array secara descending (menurun)
    public static void selectionSortDescending(int[] larik) {
        int N = larik.length; // Menyimpan panjang array
        for (int iterasi = 0; iterasi < N - 1; iterasi++) { // Loop untuk iterasi sorting
            int maxIndex = iterasi; // Inisialisasi indeks elemen terbesar
            for (int elemen = iterasi + 1; elemen < N; elemen++) { // Loop mencari elemen terbesar
                if (larik[elemen] > larik[maxIndex]) { // Jika ditemukan elemen lebih besar, perbarui maxIndex
                    maxIndex = elemen;
                }
            }
            // Menukar elemen terbesar dengan elemen pertama pada iterasi ini
            int temp = larik[iterasi];
            larik[iterasi] = larik[maxIndex];
            larik[maxIndex] = temp;
        }
    }
    // Metode Insertion Sort
    public static void insertionSort(int[] larik) {
        int N = larik.length;
        for (int i = 1; i < N; i++) {
            int key = larik[i];
            int j = i - 1;
            while (j >= 0 && larik[j] > key) {
                larik[j + 1] = larik[j];
                j = j - 1;
            }
            larik[j + 1] = key;
        }
    }
    // 🔽 Metode Insertion Sort Descending (Baru Ditambahkan)
    public static void insertionSortDescending(int[] larik) {
        int N = larik.length;
        for (int i = 1; i < N; i++) {
            int key = larik[i];
            int j = i - 1;
            while (j >= 0 && larik[j] < key) { // Perbedaan utama: `>` diganti `<`
                larik[j + 1] = larik[j];
                j = j - 1;
            }
            larik[j + 1] = key;
        }
    }
    public static void quickSortAscending(int[] x, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= j && x[i] <= x[awal]) i++; // Langkah 2
            while (j > awal && x[j] > x[awal]) j--; // Langkah 3
            while (i < j) {
                // Langkah 5: Tukar nilai x[i] dengan x[j]
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                while (i <= akhir && x[i] <= x[awal]) i++; // Langkah 6
                while (j > awal && x[j] > x[awal]) j--; // Langkah 7
            }
            // Langkah 8: Tukar nilai x[awal] dengan x[j]
            int temp = x[awal];
            x[awal] = x[j];
            x[j] = temp;
            
            // Rekursi
            quickSortAscending(x, awal, j - 1); // Langkah 9
            quickSortAscending(x, j + 1, akhir); // Langkah 10
        }
    }
    
    public static void quickSortDescending(int[] x, int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= j && x[i] >= x[awal]) i++; // Langkah 2 (dibalik tanda)
            while (j > awal && x[j] < x[awal]) j--; // Langkah 3 (dibalik tanda)
            while (i < j) {
                // Langkah 5: Tukar nilai x[i] dengan x[j]
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                while (i <= akhir && x[i] >= x[awal]) i++; // Langkah 6
                while (j > awal && x[j] < x[awal]) j--; // Langkah 7
            }
            // Langkah 8: Tukar nilai x[awal] dengan x[j]
            int temp = x[awal];
            x[awal] = x[j];
            x[j] = temp;
            
            // Rekursi
            quickSortDescending(x, awal, j - 1); // Langkah 9
            quickSortDescending(x, j + 1, akhir); // Langkah 10
        }
    }
 public static void mergeSortAscending(int[] src, int[] dest, int awal, int akhir) {
        int length = akhir - awal;
        if (length < 2) return; // Langkah 0
        
        int mid = (awal + akhir) / 2; // Langkah 1
        
        mergeSortAscending(dest, src, awal, mid); // Langkah 2
        mergeSortAscending(dest, src, mid, akhir); // Langkah 3
        
        if (src[mid - 1] <= src[mid]) { // Langkah 4
            System.arraycopy(src, awal, dest, awal, length);
            return;
        }
        
        mergeAscending(src, dest, awal, mid, akhir); // Langkah 5
    }
    
    private static void mergeAscending(int[] src, int[] dest, int low, int mid, int high) {
        int i = low, j = mid, k = low;
        
        while (i < mid && j < high) {
            dest[k++] = (src[i] <= src[j]) ? src[i++] : src[j++];
        }
        
        while (i < mid) {
            dest[k++] = src[i++];
        }
        while (j < high) {
            dest[k++] = src[j++];
        }
    }
    
    public static void mergeSortDescending(int[] src, int[] dest, int awal, int akhir) {
        int length = akhir - awal;
        if (length < 2) return;
        
        int mid = (awal + akhir) / 2;
        
        mergeSortDescending(dest, src, awal, mid);
        mergeSortDescending(dest, src, mid, akhir);
        
        if (src[mid - 1] >= src[mid]) {
            System.arraycopy(src, awal, dest, awal, length);
            return;
        }
        
        mergeDescending(src, dest, awal, mid, akhir);
    }
    
    private static void mergeDescending(int[] src, int[] dest, int low, int mid, int high) {
        int i = low, j = mid, k = low;
        
        while (i < mid && j < high) {
            dest[k++] = (src[i] >= src[j]) ? src[i++] : src[j++];
        }
        
        while (i < mid) {
            dest[k++] = src[i++];
        }
        while (j < high) {
            dest[k++] = src[j++];
        }
    }
  
}