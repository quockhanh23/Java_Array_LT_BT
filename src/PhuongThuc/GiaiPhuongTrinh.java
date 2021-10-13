package PhuongThuc;

import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        String res = bmi(a, b);
        System.out.println(res);
//        String c = giaiPT(a, b);
//        System.out.println("phương trình có nghiệm là : " + c);


    }

//    public static String giaiPT(int a, int b) {
//        String res;
//        if (a == 0 && b == 0) {
//            res = "Phương trình vô số nghiệm";
//
//
//        } else if (a == 0 && b != 0) {
//            res = "Phương trình vô  nghiệm";
//        } else {
//            res = "phương trình có nghiệm là " + (-b / a);
//        }
//        return res;
//    }

    public static String bmi(double a, double b) {
        String res2;
        double c = a / b * 2;
        if (c > 0 && c < 25) {
            res2 = "gầy quá cần ăn nhiều thịt chó " + c;
        } else if (c > 25 && c < 50) {
            res2 = "ok rồi" + c;

        } else if (c > 50 && c < 60) {
            res2 = "sắp béo rồi " + c;
        }else if (c > 70) {
                res2 = "béo rồi đấy " + c;

        } else
            res2 = "lỗi hệ thống" + c;

        return res2;
    }
}

