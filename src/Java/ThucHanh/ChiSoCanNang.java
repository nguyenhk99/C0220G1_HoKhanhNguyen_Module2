package Java.ThucHanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
        double weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        double height = scanner.nextDouble();
        float bmi = (float) (weight/Math.pow(height,2));

        if (bmi < 18)
            System.out.printf("bmi: " + bmi + " Underweight");
        else if (bmi < 25.0)
            System.out.printf("bmi: " + bmi + " Normal");
        else if (bmi < 30.0)
            System.out.printf("bmi: " + bmi + " Overweight");
        else
            System.out.printf("bmi: " + bmi + " Obese");
    }
}
