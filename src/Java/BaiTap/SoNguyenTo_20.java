package Java.BaiTap;


public class SoNguyenTo_20 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        boolean check = true;

        while (count < 20) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(number + " ");
                count++;
            } else {
                check = true;
            }
            number++;
        }
    }
}
