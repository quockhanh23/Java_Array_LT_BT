package com.company;

import java.util.Scanner;

public class THDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng học sinh: ");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("Nhiều quá");
        } while (size > 5);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int k : array) {
            System.out.print(" " + k );
            if (k >= 5 && k <= 10 ) {
                count++;
            }else if (k > 10) {
                System.out.println(", Lỗi: " + k + " không là điểm");
            }


        }
        System.out.print("\n số học sinh thi đỗ : " + count);
    }
}
