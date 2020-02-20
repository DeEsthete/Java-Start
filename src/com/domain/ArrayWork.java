package com.domain;

import java.util.Arrays;

public class ArrayWork {
    public static int[] quickSort(int[] array) {
        boolean isOk = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                isOk = false;
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        if (!isOk) {
            quickSort(array);
        }
        return array;
    }

    public static int findDivider(int[] numbers) {
        return findDivider(numbers, 0);
    }

    public static int findDivider(int[] numbers, int divider) {
        return divider;
        //boolean isOk = Arrays.stream(numbers).filter(n -> n % divider == 0).findAny().isPresent();
    }
}