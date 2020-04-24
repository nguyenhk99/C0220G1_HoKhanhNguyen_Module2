package CauTrucDuLieuVaGiaiThuat.BaiTap.LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node head;
    private static int numNodes = 0;

    public static int getNumNodes() {
        return numNodes;
    }

    public MyLinkedList() {
    }

    public MyLinkedList(E element) {
        head = new Node(element);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        numNodes++;
        temp.next = new Node(element);
    }

//    public void removeFirst() {
//        head = head.next;
//        numNodes--;
//    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        Object data = null;
        if (index == 0) {
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public void remove(E e) {
        if (head.data.equals(e)) {
            remove(0);
        } else if (head.data != e) {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNodes--;
                }
                temp = temp.next;
            }
        }
    }

    public Object getFirst() {
        return head.data;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        return numNodes--;
    }

    public MyLinkedList clone() {
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList Null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }

        return returnLinkedList;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for(int i =0;i<numNodes ;i++){
            if(temp.data.equals(element)){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public void clear(){
        Node temp = head;
        for(int i =0;i<numNodes;i++){
            temp = null;
            temp = temp.next;
        }
    }
}
