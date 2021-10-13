package BT_mang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang2_ok {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần từ cho mảng");
        size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        if (size > 5) {
            System.out.println("Nhiều quá");
        }
        if (size <= 5) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = scanner.nextInt();
            }
        }
        int lengthVip = arr1.length + arr2.length;
        int[] arrVip = new int[lengthVip];

        for (int i = 0; i < arr1.length; i++) {
            arrVip[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arrVip[arr1.length + i] = arr2[i];

        }

        System.out.println(Arrays.toString(arrVip));

    }
}



