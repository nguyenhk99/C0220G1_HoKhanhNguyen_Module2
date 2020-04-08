package Java.BaiTap;

import java.util.*;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỉ lệ: USD = 23000VND");
        System.out.println("Nhập tiền đô muốn đổi");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(vnd + "vnd");
    }
}
