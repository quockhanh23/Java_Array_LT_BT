package BT_mang;

import java.util.Scanner;

public class Test1 {

        public static void main(String[] args) {
            int[] arr;

            System.out.println("số phần tử là");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            arr = new int[n];

            if (n > 10) {
                System.out.println("số lớn quá");
            } else if (n < 10) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
                    arr[i] = scanner.nextInt();
                }

            }
            int sum = 0;
            int cout = 0;
            int avg = 0;
            System.out.println("Danh sách phần tử");
            for (int i = 0; i < arr.length; i++) {
                cout++;
                sum = sum + arr[i];
                System.out.print(" " + arr[i]);

            }
            System.out.println("\n"+"Tổng là " + sum);
            avg = sum / cout;
            System.out.println("Trung bình " + avg);

        }

    }

