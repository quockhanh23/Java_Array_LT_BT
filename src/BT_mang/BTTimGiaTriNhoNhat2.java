package BT_mang;

import java.util.Scanner;

public class BTTimGiaTriNhoNhat2 {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("số lượng phần tử là : " + n);
        arr = new int[n];

        if (n > 10) {
            System.out.println("Số lượng phần tử phải nhỏ hơn 10");
        }
        if (n <= 10) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " : ");
                arr[j] = scanner.nextInt();

            }

        }
        System.out.println("Danh sách các phần tử : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }

        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                System.out.println("Số nhỏ nhất là: " + min);
            }

        }

    }
}
