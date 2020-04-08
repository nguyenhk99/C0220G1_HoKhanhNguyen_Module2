package MangVaPhuongThuc.BaiTap;

import java.util.Random;
import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so cot");
        int k = scanner.nextInt();
        System.out.println("Nhap chieu dai moi cot");
        int l = scanner.nextInt();

        int[][] arr = new int[k][l];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length; j ++){
                arr[i][j] = random.nextInt(100);
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Nhap cot can tinh tong");
        int a = scanner.nextInt()-1;
        int temp =0;

        for(int i = 0 ;i<arr[a].length;i++){
            temp += arr[a][i];
        }
        System.out.println("Tong cua cot do la: " + temp);
    }
}
