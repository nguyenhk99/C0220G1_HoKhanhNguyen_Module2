package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

    public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Nhap canh a");
            int a = scanner.nextInt();
            System.out.println("Nhap canh b");
            int b = scanner.nextInt();
            System.out.println("Nhap canh c");
            int c = scanner.nextInt();

            if(a+b < c|| a+c<b || b+c<a || a<0 || b<0 || c<0){
                System.out.println("ngoai le");
            } else {
                System.out.println("hop le");
            }
        }catch (Exception InputMismatchException){
            System.out.println("Loi Nhap Xuat");
        }

    }
}
