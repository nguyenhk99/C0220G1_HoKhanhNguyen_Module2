package OOP.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    public double a;
    public double b;
    private double c;
    private double delta;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.delta = b * b - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Nhap a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhap b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhap c");
        int c = new Scanner(System.in).nextInt();

        QuadraticEquation Quadra = new QuadraticEquation(a, b, c);

        if (Quadra.getDiscriminant() > 0) {
            System.out.println("phuong trinh nghiem 1 la: " + Quadra.getRoot1());
            System.out.println("phuong trinh nghiem 2 la: " + Quadra.getRoot2());
        } else if (Quadra.getDiscriminant() == 0) {
            System.out.println("phuong trinh co 1 nghiem la: " + Quadra.getRoot1());
        } else System.out.println("The equation has no roots");
    }
}