package Test;

import java.util.regex.Pattern;

class HocSinh {
    public static void main(String[] args) {
     String pattern = "^(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19[0-9]{2}|200[0-2])$";
        String a = "27/07/2002";
        System.out.println(a.matches(pattern));
    }

}
