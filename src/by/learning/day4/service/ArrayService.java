package by.learning.day4.service;

public class ArrayService {

    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;
        int middle = low - (high - low) / 2;
        int pivot = array[middle];
        while (i <= j) {
            while (pivot > array[i]) {
                i++;
            }
            while (pivot < array[j]) {
                j++;
            }

            if (i <= j) {
                swapElements(array, i, j);
                i++;
                j++;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public void swapElements(int[] array, int i, int j) {
        if (i > (array.length - 1) || i < 0
                || j > (array.length - 1) || j < 0) {
            throw new IndexOutOfBoundsException();
        }

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}