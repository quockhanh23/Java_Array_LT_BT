package BT_mang;

import java.util.Scanner;

public class SapXepTangDan {
    public static void main(String[] args) {
        int num, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số lượng phần tử của mảng:");
        num = input.nextInt();

        int array[] = new int[num];
        System.out.println("Nhập vào các phần tử trong mảng:");

        for (int i = 0; i < num; i++)                   // duyệt mảng đã nhập
            array[i] = input.nextInt();

        for (int i = 0; i < (num - 1); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {          // đổi dấu thành sắp xếp giảm dần
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}

