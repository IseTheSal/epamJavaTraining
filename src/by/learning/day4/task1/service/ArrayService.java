package by.learning.day4.task1.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayService {

    private static final Logger logger = LogManager.getLogger(ArrayService.class);

    public void quickSort(int[] array, int low, int high) {
        logger.info("quickSort is working");
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swapElements(array, i, j);
                i++;
                j--;
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
        logger.info("swap elements is working");
        if (i > (array.length - 1) || i < 0
                || j > (array.length - 1) || j < 0) {
            logger.warn("IndexOfBoundException was thrown");
            throw new IndexOutOfBoundsException();
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public int receiveMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int receiveMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void countingSort(int[] arr, int exp) {
        logger.info("counting sort is working");
        int[] countingArray = new int[10];
        int[] resultArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new IllegalArgumentException();
            }
            countingArray[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i - 1];
        }

        for (int i = resultArray.length - 1; i >= 0; i--) {
            resultArray[countingArray[(arr[i] / exp) % 10] - 1] = arr[i];
            countingArray[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = resultArray[i];
        }
    }

    public void radixSort(int[] arr) {
        int maxValue = receiveMax(arr);

        for (int exp = 1; maxValue / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    void mergeHalves(int[] arr, int left, int middle, int right) {
        int firstLength = middle - left + 1;
        int secondLength = right - middle;

        int[] arrayLeft = new int[firstLength];
        int[] arrayRight = new int[secondLength];

        for (int i = 0; i < firstLength; ++i) {
            arrayLeft[i] = arr[left + i];
        }

        for (int j = 0; j < secondLength; ++j) {
            arrayRight[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;

        int currentPosition = left;
        while (i < firstLength && j < secondLength) {
            if (arrayLeft[i] <= arrayRight[j]) {
                arr[currentPosition] = arrayLeft[i];
                i++;
            } else {
                arr[currentPosition] = arrayRight[j];
                j++;
            }
            currentPosition++;
        }

        while (i < firstLength) {
            arr[currentPosition] = arrayLeft[i];
            i++;
            currentPosition++;
        }

        while (j < secondLength) {
            arr[currentPosition] = arrayRight[j];
            j++;
            currentPosition++;
        }
    }

    void mergeSort(int[] arr, int leftPosition, int rightPosition) {
        logger.info("merge sort is working");
        if (leftPosition < rightPosition) {
            int middle = (leftPosition + rightPosition) / 2;

            mergeSort(arr, leftPosition, middle);
            mergeSort(arr, middle + 1, rightPosition);

            mergeHalves(arr, leftPosition, middle, rightPosition);
        }
    }


}

