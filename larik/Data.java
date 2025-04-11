package com.mycompany.larik;

public class Data {
    public static void main(String[] args) {
        int N = 10000000; // Ukuran array
        int[] data1 = new int[N];
        int[] data2 = new int[N];

        // Mengisi array dengan angka acak menggunakan Math.random()
        for (int i = 0; i < N; i++) {
            int angka = (int) (Math.random() * 10000); // Angka acak 0-9999
            data1[i] = angka;
            data2[i] = angka;
        }

        // Menghitung waktu untuk sorting ascending
        long startTimeAsc = System.nanoTime();
        Larik.quickSortAscending(data1, 0, N - 1);
        long endTimeAsc = System.nanoTime();
        long durationAsc = endTimeAsc - startTimeAsc;

        // Menghitung waktu untuk sorting descending
        long startTimeDesc = System.nanoTime();
        Larik.quickSortDescending(data2, 0, N - 1);
        long endTimeDesc = System.nanoTime();
        long durationDesc = endTimeDesc - startTimeDesc;

        // Menampilkan hasil waktu eksekusi
        System.out.println("Waktu eksekusi Quick Sort ASCENDING untuk N = " + N + " adalah " + durationAsc + " nanosekon");
        System.out.println("Waktu eksekusi Quick Sort DESCENDING untuk N = " + N + " adalah " + durationDesc + " nanosekon");
    }
}
