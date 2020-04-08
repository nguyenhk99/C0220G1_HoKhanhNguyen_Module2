package Java.BaiTap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1: {
                System.out.println("input height");
                int height = scanner.nextInt();
                System.out.println("input width");
                int width = scanner.nextInt();

                for (int i = 0; i < height; i++) {
                    System.out.println("");
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                }
            }
            case 2: {
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                }
                for (int i = 5; i >= 1; i--) {
                    System.out.println("");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
            }
            case 3: {
                int height;
                System.out.print("height = ");
                height = scanner.nextInt();

                for (int i = 1; i <= height; i++) {
                    for (int j = 0; j < height - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
