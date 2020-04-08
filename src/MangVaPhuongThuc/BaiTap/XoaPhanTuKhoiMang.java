package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 5, 2, 10, 32, 22};
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Nhap so can xoa");
        int X = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
                check = true;
            }
        }
        if(check){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }else {
            System.out.println("Cant find");
        }
    }
}
