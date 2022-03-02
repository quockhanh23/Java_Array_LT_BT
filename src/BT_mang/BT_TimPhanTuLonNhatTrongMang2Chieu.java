package BT_mang;

import java.util.Scanner;

public class BT_TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int size1 = 2;
        int size2 = 2;

        int[][] arr = new int[size1][size2];
        arr[0][0] = 5;
        arr[0][1] = 1;
        arr[1][0] = 8;
        arr[1][1] = 2;
        int sum = 0;
        int max = arr[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                sum = sum + arr[i][j];
            }

        }
        System.out.println(max);
        System.out.println(sum);
    }

}

