package BT_mang;

import java.util.Scanner;

public class TimViTri2 {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("số lượng phần tử là : " + n);
        arr = new int[n];

        if (n > 6) {
            System.out.println("Số lượng phần tử phải nhỏ hơn 10");
        }
        if (n <= 6) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " : ");
                arr[j] = scanner.nextInt();

            }
        }
        System.out.println("Nhập phần tử muốn tìm");
        int x = scanner.nextInt();
        int pos = searchElement(arr, x);
        if (pos == -1) {
            System.out.println("không tìm thấy " + x + "trong mảng");
        } else
            System.out.println(x + " có vị trí là " + pos);

    }

    static int searchElement(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
       return -1;
    }
}
