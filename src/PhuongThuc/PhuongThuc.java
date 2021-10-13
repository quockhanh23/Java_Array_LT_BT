package PhuongThuc;

import java.util.Scanner;

public class PhuongThuc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        if (size > 5) {
            System.out.println("nhiều quá");
        } else
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;

        }
        return (double) sum / array.length;
    }

}
