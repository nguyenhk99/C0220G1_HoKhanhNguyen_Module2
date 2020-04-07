package Java.BaiTap;
import java.util.Scanner;
public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();
        int ones = num % 10;
        int tens = (num % 100) / 10;
        int hundreds = num / 100;
        boolean check = true;
        if(tens == 0 && hundreds == 0){
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
        }else if (tens == 1 && hundreds == 0){
            switch (ones){
            case 1:
                System.out.println("Eleven");
                break;
            case 2:
                System.out.println("twelve");
                break;
            case 3:
                System.out.println("thirteen");
                break;
            case 4:
                System.out.println("fourteen");
                break;
            case 5:
                System.out.println("fifteen");
                break;
            case 6:
                System.out.println("sixteen");
                break;
            case 7:
                System.out.println("seventeen");
                break;
            case 8:
                System.out.println("eighteen");
                break;
            case 9:
                System.out.println("nineteen");
                break;
        }
    }else if (hundreds == 0){
            switch(tens){
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (ones){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }else {
            switch (hundreds){
                case 1:
                    System.out.println("one hundred");
                    break;
                case 2:
                    System.out.println("two hundred");
                    break;
                case 3:
                    System.out.println("three hundred");
                    break;
                case 4:
                    System.out.println("four hundred");
                    break;
                case 5:
                    System.out.println("five hundred");
                    break;
                case 6:
                    System.out.println("six hundred");
                    break;
                case 7:
                    System.out.println("seven hundred");
                    break;
                case 8:
                    System.out.println("eight hundred");
                    break;
                case 9:
                    System.out.println("nine hundred");
                    break;
            }
            switch (tens){
                case 1:
                    check = false;
                    switch (ones){
                        case 1:
                            System.out.println("eleven");
                            break;
                        case 2:
                            System.out.println("twelve");
                            break;
                        case 3:
                            System.out.println("thirteen");
                            break;
                        case 4:
                            System.out.println("fourteen");
                            break;
                        case 5:
                            System.out.println("fifteen");
                            break;
                        case 6:
                            System.out.println("sixteen");
                            break;
                        case 7:
                            System.out.println("seventeen");
                            break;
                        case 8:
                            System.out.println("eighteen");
                            break;
                        case 9:
                            System.out.println("nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            if (check){
            switch (ones){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
}}
}