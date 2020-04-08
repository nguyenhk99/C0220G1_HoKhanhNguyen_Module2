package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your choice: ");
           choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    double C;
                    System.out.println("input F");
                    double F = scanner.nextInt();
                    C = (5.0 / 9) * (F - 32);
                    System.out.println("C: " + C);
                    break;
                }
                case 2: {
                    double F;
                    System.out.println("input C");
                    double C = scanner.nextInt();
                    F = (9 / 5) * (C + 32);
                    System.out.println("F: " + F);
                    break;
                }
                case 0:
                    System.out.println("Bye");
            }

        }while (choice !=0);
    }
}

