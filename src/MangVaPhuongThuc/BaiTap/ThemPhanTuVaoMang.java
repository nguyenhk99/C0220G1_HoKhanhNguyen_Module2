package MangVaPhuongThuc.BaiTap;

import java.util.*;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=4;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        System.out.println("Mang ban dau la: ");
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vi tri them phan tu: ");
        int X = scanner.nextInt();

        System.out.println("So ban muon them la: ");
        int a = scanner.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(X == i){
                for(int j = arr.length-1;j>X;j--)
                arr[j] = arr[j-1];
            }
        }
        arr[X] = a;

        System.out.println("Mang da duoc thay doi la: ");
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
