package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator{
    public double calculator(String button,double num1,double num2) {
        double result = 0;
        switch (button) {
            case "Addition(+)": {
                result = addition(num1, num2);
                break;
            }
            case "Subtraction(-)": {
                result = subtraction(num1, num2);
                break;
            }
            case "Multiplication(*)": {
                result = multiplication(num1, num2);
                break;
            }
            case "Division(/)": {
                try {
                    result = division(num1, num2);
                } catch (ArithmeticException e) {
                    e.getMessage();
                }
                break;
            }
        }
        return result;
    }
    @Override
    public double addition(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double division(double num1, double num2){
            return num1 / num2;
    }
}
