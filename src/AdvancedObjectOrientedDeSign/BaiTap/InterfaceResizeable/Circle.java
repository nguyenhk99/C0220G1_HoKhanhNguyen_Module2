package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Circle extends Shape implements Resizeable{
    public double size = 1;

    public Circle(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size += percent;
    }

    @Override
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

}
