package BT_mang;

import java.util.Scanner;

public class BTTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử ");
            size = scan.nextInt();
            System.out.println("Số phần tử bạn nhập là :" + size);
            if (size > 10) {
                System.out.println("Số phần tử phải nhỏ hơn:  10 ");
            }
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {

            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scan.nextInt();
            i++;

        }
        System.out.print("Danh sách phần tử: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int min = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];

            }

        }
        System.out.println("Phần tử nhỏ nhất là : " + min);
    }
}
