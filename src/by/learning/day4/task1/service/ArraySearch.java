package by.learning.day4.task1.service;

import by.learning.day4.task1.entity.CustomArray;

public class ArraySearch {

    public int binarySearchIndex(CustomArray customArray, int key) {
        int[] array = customArray.getArray();
        if (!customArray.isSorted()) {
            ArrayService arrayService = new ArrayService();
            arrayService.quickSort(array, 0, array.length);
        }
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex) {
            int middle = lowIndex + (highIndex - lowIndex) / 2;
            if (array[middle] > key) {
                highIndex = middle - 1;
            } else {
                lowIndex = middle + 1;
            }
        }
        return highIndex;
    }
}
