package CauTrucDuLieuVaGiaiThuat.BaiTap.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList("dsa");
        myLinkedList.add(1,"cxz");
        myLinkedList.addLast("nbv");
        myLinkedList.clear();
        MyLinkedList myLinkedList1 = myLinkedList.clone();

        myLinkedList.get(0);
    }
}
