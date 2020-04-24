package Java.ThucHanh;
import java.util.Scanner;
public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập num");
        int num = scanner.nextInt();

        boolean b = num % 4 == 0;
        if (b){
            boolean b1 = num % 100 != 0;
            if (b1){
                System.out.println(num + " là năm nhuận");
            }else {
                boolean b2 = num % 400 == 0;
                if (b2){
                    System.out.println(num + " là năm nhuận");
                }else System.out.println(num + " không phải là năm nhuận");
            }
        }else System.out.println(num + " không phải là năm nhuận");
    }
}
