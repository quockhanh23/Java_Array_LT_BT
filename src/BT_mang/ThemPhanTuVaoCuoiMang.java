package BT_mang;

public class ThemPhanTuVaoCuoiMang {

    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5;
        int x = 10;
        System.out.print("Trước khi thêm: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insert(arr, size, n, x);
        System.out.print("\nSau khi thêm  : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int insert(int[] arr, int size, int n, int x) {
        // Nếu số lượng phần tử lớn hơn hoặc bằng thì ko thể thêm
        if (n >= size) {
            return n;
        }
        arr[5] = x;   // Thêm vào cuối mảng
        return n + 1; // Tăng số lượng phần tử của mảng thêm 1
    }

}
