package com.mycompany.larik;

//import java.util.Arrays; // Import library Arrays untuk mengurutkan array
public class SearchingMain {

    public static void main(String[] args) {
        // Inisialisasi array dengan beberapa angka
        int[] data = {5, 8, 26, 15, 11, 31};
        int[] data2 = {5, 8, 26, 15, 11, 31};
        int kunci = -1; // Nilai yang akan dicari dalam array

        System.out.println("Data dalam larik:");
        Larik.cetak(data); // Memanggil metode cetak() untuk menampilkan isi array

        // **Sequential Search**
        int hasilSeq = Larik.sequentialSearch(data, kunci); // Memanggil metode sequentialSearch()
        System.out.println("Hasil Sequential Search dari " + kunci + ": "
                + (hasilSeq != -1 ? "Ditemukan di indeks " + hasilSeq : "Tidak ditemukan"));

//        // **Sorting sebelum Binary Search dan Interpolation Search**
//        Arrays.sort(data); // Mengurutkan array agar bisa digunakan oleh Binary & Interpolation Search
//        System.out.println("Data setelah diurutkan:");
//        Larik.cetak(data); // Menampilkan array setelah diurutkan
        // **Binary Search**
        int hasilBin = Larik.binarySearch(data, kunci); // Memanggil metode binarySearch()
        System.out.println("Hasil Binary Search dari " + kunci + ": "
                + (hasilBin != -1 ? "Ditemukan di indeks " + hasilBin : "Tidak ditemukan"));

        // **Interpolation Search**
        int hasilInterp = Larik.interpolationSearch(data, kunci); // Memanggil metode interpolationSearch()
        System.out.println("Hasil Interpolation Search dari " + kunci + ": "
                + (hasilInterp != -1 ? "Ditemukan di indeks " + hasilInterp : "Tidak ditemukan"));

    }
}
