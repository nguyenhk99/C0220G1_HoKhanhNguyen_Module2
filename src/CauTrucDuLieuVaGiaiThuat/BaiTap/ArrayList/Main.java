package CauTrucDuLieuVaGiaiThuat.BaiTap.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0,1);
        myList.add(1,10);
        myList.add(2,15);
        System.out.println(myList.get(2));
    }
}
