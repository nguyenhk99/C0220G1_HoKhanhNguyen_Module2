package Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//    ConNguoi hocSinh = new HocSinh();
//    hocSinh = (HocSinh) hocSinh;
//    ((HocSinh) hocSinh).tinhTien();
//    ((HocSinh) hocSinh).sayNo();

        List<Integer> list = new ArrayList(2);
         list.add(5);
         list.add(10);
         list.add(12);
        list.remove(0);
        System.out.println(list);
    }
}
