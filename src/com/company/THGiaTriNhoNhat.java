package com.company;

import java.util.Scanner;

public class THGiaTriNhoNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {4, 12, 7, 8, 10, 32, 9};
        int minNumber = minValue(arr);
        System.out.println("Giá trị nhỏ nhất là: " + arr[minNumber]);
        int max = maxValue(arr);
        System.out.println("Số lớn nhất: " + max);
    }

    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
