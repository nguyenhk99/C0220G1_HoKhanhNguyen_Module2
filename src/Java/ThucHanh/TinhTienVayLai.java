package Java.ThucHanh;

import java.util.Scanner;

public class TinhTienVayLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laisuat = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("so tien vay: ");
        money = input.nextDouble();

        System.out.println("so thang: ");
        month = input.nextInt();

        System.out.println("lai suat: ");
        laisuat = input.nextDouble();

        double TienLai = 0;
        for(int i = 0; i < month; i++){
            TienLai = money * (laisuat/100)/12;
        }

        System.out.println("Tổng số tiền:  " + (TienLai + money));
    }
}
