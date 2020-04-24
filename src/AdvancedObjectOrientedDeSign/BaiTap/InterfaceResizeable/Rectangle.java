package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Rectangle  extends Shape implements Resizeable{
    public double size = 1;

    public Rectangle(double size) {
        this.size = size;
    }

    public Rectangle() {
    }

    @Override
    public void resize(double percent) {
        this.size += percent;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


}
