package com.company;

import java.util.Scanner;

public class THTimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"kuku", "mai cồ","xen","xiao"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên học sinh muốn tìm :");
        String input_name = scan.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Số thứ tự của học sinh " + input_name + " là: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + " trong danh sách.");
        }
    }
}
