package Java.ThucHanh;
import java.util.Scanner;
public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập num");
        int num = scanner.nextInt();

        if (num % 4 == 0){
            if (num %100 != 0){
                System.out.println(num + " là năm nhuận");
            }else if (num % 400 == 0){
                System.out.println(num + " là năm nhuận");
            }else System.out.println(num + " không phải là năm nhuận");
        }else System.out.println(num + " không phải là năm nhuận");
    }
}
