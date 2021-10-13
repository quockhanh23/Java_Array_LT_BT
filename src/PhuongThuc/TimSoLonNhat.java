package PhuongThuc;

import java.util.Scanner;

public class TimSoLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ 1");
        double a = scanner.nextDouble();
        System.out.println("nhập số thứ 2");
        double b = scanner.nextDouble();
        System.out.println("nhập số thứ 3");
        double c = scanner.nextDouble();
        System.out.println("max là " + findMax(a,b,c));


    }

    public static double findMax(double a, double b, double c) {

        double max = a;
        if (max < b) {
            max = b;

        } else if (max < c) {
            max = c;
        } else
            System.out.println("3 số bằng nhau");

        return max;
    }

}
