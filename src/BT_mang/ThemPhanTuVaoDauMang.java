package BT_mang;

import java.util.Scanner;

public class ThemPhanTuVaoDauMang {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();
            // khởi tạo arr
            int [] arr = new int [n];

            for (int i = 0; i < n; i++) {
                System.out.printf("arr" + "[" + i + "] = ");
                arr[i] = scanner.nextInt();
            }
            System.out.print("Nhập phần tử k = ");
            int k = scanner.nextInt();
            int[] arr2 = insert(arr, k);
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);

            }
    }
    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int[] tempArr = new int[tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;

    }
}
