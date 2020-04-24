package OOP.BaiTap;

import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = java.time.LocalTime.now();
    }

    public LocalTime start() {
        return this.startTime = java.time.LocalTime.now();
    }

    public LocalTime stop() {
        return this.endTime = java.time.LocalTime.now();
    }

    public int getElapsedTime() {
        return (this.endTime.getSecond() - this.startTime.getSecond()) * 1000;
    }
}


class selectionSort {

    private static void nhap_mang(int[] A, int n) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * 100000);
        }
    }

    private static void xuat_mang(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    private static void hoan_vi(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    private static void sap_xep_chon(int[] A, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minArr = i;
            for (int j = i + 1; j < n; j++) {
                if (A[minArr] > A[j]) {
                    minArr = j;
                }
            }
            if (i != minArr)
                hoan_vi(A, minArr, i);
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int[] A = new int[100000];
        int n = 0;
        n = scn.nextInt();
        A = new int[n];

        nhap_mang(A, n);

        stopWatch.start();
        System.out.println("Mảng sau khi sắp xếp (Selection Sort)");
        sap_xep_chon(A, n);
        xuat_mang(A, n);
        stopWatch.stop();

        System.out.println("");
        System.out.println("thoi gian sap xep la: ");
        System.out.println(stopWatch.getElapsedTime() + "milisecond");
    }

}
