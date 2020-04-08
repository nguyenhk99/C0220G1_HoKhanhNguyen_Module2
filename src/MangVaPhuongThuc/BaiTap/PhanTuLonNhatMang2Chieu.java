package MangVaPhuongThuc.BaiTap;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class PhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng: ");
        int x = scanner.nextInt();
        System.out.println("Nhập chiều dài của mỗi mảng: ");
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        int max = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Nhập phần tử thứ: " + j + " của mảng " + i);
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max la: " + max);
    }
}
