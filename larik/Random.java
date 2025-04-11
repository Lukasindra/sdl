package com.mycompany.larik;

import java.util.Arrays; // Tambahkan import Arrays

public class Random {

    public static void main(String[] args) {

        int N = 1000000; // 1 juta data
        int[] data = new int[N];

        // Mengisi larik dengan angka acak
        for (int i = 0; i < N; i++) {
            data[i] = (int) (Math.random() * 1000000); // 0 - 999999
        }

        // Salinan data untuk setiap metode sorting
        int[] dataBubble = Arrays.copyOf(data, N);
        int[] dataSelection = Arrays.copyOf(data, N);
        int[] dataInsertion = Arrays.copyOf(data, N);
        int[] dataQuick = Arrays.copyOf(data, N);

        boolean ascending = true; // Ubah ke false jika ingin descending

        // Uji Bubble Sort
        long startBubble = System.currentTimeMillis();
        bubbleSort(dataBubble, ascending);
        long endBubble = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (endBubble - startBubble) + " ms");

        // Uji Selection Sort
        long startSelection = System.currentTimeMillis();
        selectionSort(dataSelection, ascending);
        long endSelection = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (endSelection - startSelection) + " ms");

        // Uji Insertion Sort
        long startInsertion = System.currentTimeMillis();
        insertionSort(dataInsertion, ascending);
        long endInsertion = System.currentTimeMillis();
        System.out.println("Insertion Sort: " + (endInsertion - startInsertion) + " ms");

        // Uji Quick Sort
        long startQuick = System.currentTimeMillis();
        quickSort(dataQuick, 0, N - 1, ascending);
        long endQuick = System.currentTimeMillis();
        System.out.println("Quick Sort: " + (endQuick - startQuick) + " ms");
    }

    // Bubble Sort dengan Ascending/Descending
    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Jika tidak ada pertukaran, hentikan
            }
        }
    }

    // Selection Sort dengan Ascending/Descending
    public static void selectionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int targetIdx = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascending && arr[j] < arr[targetIdx]) || (!ascending && arr[j] > arr[targetIdx])) {
                    targetIdx = j;
                }
            }
            swap(arr, i, targetIdx);
        }
    }

    // Insertion Sort dengan Ascending/Descending
    public static void insertionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && ((ascending && arr[j] > key) || (!ascending && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Quick Sort dengan Ascending/Descending
    public static void quickSort(int[] arr, int low, int high, boolean ascending) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, ascending);
            quickSort(arr, low, pivotIndex - 1, ascending);
            quickSort(arr, pivotIndex + 1, high, ascending);
        }
    }

    private static int partition(int[] arr, int low, int high, boolean ascending) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if ((ascending && arr[j] < pivot) || (!ascending && arr[j] > pivot)) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Fungsi pertukaran
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
