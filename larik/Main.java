package com.mycompany.larik;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};

        System.out.println("Data sebelum diurutkan:");
        Larik.cetak(data);

        // Merge Sort Ascending
        int[] ascendingData = data.clone();
        int[] tempAsc = ascendingData.clone(); // Array sementara untuk merge sort
        Larik.mergeSortAscending(ascendingData, tempAsc, 0, ascendingData.length);
        System.out.println("Data setelah Merge Sort Ascending:");
        Larik.cetak(ascendingData);

        // Merge Sort Descending
        int[] descendingData = data.clone();
        int[] tempDesc = descendingData.clone();
        Larik.mergeSortDescending(descendingData, tempDesc, 0, descendingData.length);
        System.out.println("Data setelah Merge Sort Descending:");
        Larik.cetak(descendingData);
    }
}
  
/*public static void main(String[] args) {
        int[] data = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};

        System.out.println("Data sebelum diurutkan:");
        Larik.cetak(data);

        // Merge Sort Ascending
        int[] ascendingData = data.clone();
        int[] tempAsc = ascendingData.clone(); // Array sementara untuk merge sort
        Larik.mergeSortAscending(ascendingData, tempAsc, 0, ascendingData.length);
        System.out.println("Data setelah Merge Sort Ascending:");
        Larik.cetak(ascendingData);

        // Merge Sort Descending
        int[] descendingData = data.clone();
        int[] tempDesc = descendingData.clone();
        Larik.mergeSortDescending(descendingData, tempDesc, 0, descendingData.length);
        System.out.println("Data setelah Merge Sort Descending:");
        Larik.cetak(descendingData);
    }*/
//        int[] data = {5, 8, 26, 15, 11, 31};
//
//        System.out.println("=================================");
//        System.out.println("Sorting menggunakan Insertion Sort:");
//
//        // Ascending
//        System.out.println("\nData sebelum diurutkan:");
//        Larik.cetak(data);
//        
//        Larik.insertionSort(data);
//        System.out.println("\nData setelah diurutkan (Ascending):");
//        Larik.cetak(data);
//
//        // Descending
//        Larik.insertionSortDescending(data);
//        System.out.println("Data setelah diurutkan (Descending):");
//        Larik.cetak(data);
//
//        System.out.println("=================================");