
package com.mycompany.larik;

public class mainn {
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

