package KeThua.ThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap a");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap b");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhap c");
        double c = new Scanner(System.in).nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        System.out.println("Nhap color");
        String line = new Scanner(System.in).nextLine();
        triangle.setColor(line);
        System.out.println(triangle);
    }
}
