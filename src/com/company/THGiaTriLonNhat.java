package com.company;

import java.util.Scanner;

public class THGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scan = new Scanner(System.in);
      do {
          System.out.println("Nhập tổng số phần tử ");
          size = scan.nextInt();
          System.out.println("Số phần tử muốn nhập của bạn là :" + size);
          if (size > 20) {
              System.out.println("size nhỏ hơn 20 ");
          }
      } while (size > 20);
      array  = new  int[size];
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

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }

        }
        System.out.println("Phần tử lớn nhất là : "+ max);
    }
    }






