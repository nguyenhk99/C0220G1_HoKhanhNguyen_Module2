package CleanCodeRefactory.ThucHanh;

import java.util.Scanner;

public class DoiTenBienTachHang {
    public static class Calculator {
        public static final String ADDITION="+";
        public static final String SUBTRACTION ="-";
        public static final String MULTIPLICATION = "*";
        public static final String DIVISION = "/";


        public int calculate(int firstOperand, int secondOperand , String operator ) {

            switch (operator ) {
                case ADDITION:
                    return firstOperand + secondOperand ;
                case SUBTRACTION:
                    return firstOperand - secondOperand;
                case MULTIPLICATION:
                    return firstOperand * secondOperand ;
                case DIVISION:
                    if (secondOperand  != 0)
                        return firstOperand / secondOperand ;
                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
            }
        }
    }
    public static void main(String[] args) {
        String calculate = new Scanner(System.in).nextLine();
        Calculator calculator = new Calculator();
        System.out.println("Nhap phep tinh");
        System.out.println( calculator.calculate(5,10,calculate));
    }
}