package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 5, 2, 10, 32, 22};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Nhap so can xoa");
        int X = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                for(int j= X ;j<arr.length;j++){
                    arr[X-1] = arr[X];
                }
            }
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
