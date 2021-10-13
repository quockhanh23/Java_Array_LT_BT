package com.company;

import java.util.Scanner;

public class THGiaTriNhoNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {4, 12, 7, 8, 10, 6, 9};
        int minNumber = minValue(arr);
        System.out.println("Giá trị nhỏ nhất là: " + arr[minNumber]);
    }
    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        return min;
    }
}
