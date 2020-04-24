package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(5);
        shapes[2] = new Square(10);

        System.out.println("Truoc khi thay doi");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getSize());
        }

        System.out.println("Sau khi thay doi");
        for(int i=0;i<shapes.length;i++){
            shapes[i].resize(10);
            System.out.println(shapes[i].getSize());
        }
    }
}
