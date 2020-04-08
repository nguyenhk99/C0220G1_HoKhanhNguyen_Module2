package MangVaPhuongThuc.BaiTap;

import java.util.Random;
import java.util.Scanner;

public class MaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int k = scanner.nextInt();
        int[][] arr = new int[k][k];
        Random random = new Random();
        int temp = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr.length; j ++){
                arr[i][j] = random.nextInt(100);
            }
        }

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i == j){
                    temp += arr[i][j];
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i + j == k-1){
                    temp += arr[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo la: " + temp);
    }
}
