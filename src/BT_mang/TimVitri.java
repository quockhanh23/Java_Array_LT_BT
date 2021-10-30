package BT_mang;

import java.util.Scanner;

public class TimVitri {

        public static void main(String[] args) {
          
            int[] arr = {1,7,5,6,2,9,8,-1};
            int x = 5;
            int ViTri = searchElement(arr, x);
            if (ViTri == -1){
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Tìm thấy tại vị trí : " + ViTri);
            }
        }

        static int searchElement(int[] arr, int x) {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }

    }

