package BT_mang;

public class XoaPhanTuKhoiMang_ok {

        public static void main(String[] args) {
            int x = 6;
            int n = 5;
            int size = 20;
            int[] arr = new int[size];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 6;
            arr[3] = 5;
            arr[4] = 3;

            System.out.print("Trước khi xóa: ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");

            n = delete(arr, n, x);
            System.out.print("\nSau khi xóa : ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
        static int delete(int[] arr, int n, int x) {
            int pos = searchElement(arr, x);
            if (pos == -1) {
                System.out.println("Không tìm thấy phần tử để xóa");
            } else

            for (int i = pos; i < n; i++) {
                arr[i] = arr[i + 1];
            }
            return n - 1;
        }
        static int searchElement(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }
    }

