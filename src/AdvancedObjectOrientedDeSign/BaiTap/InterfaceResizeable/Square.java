package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Square extends Shape implements Resizeable {
    public double size = 1;

    public Square(double size) {
        this.size = size;
    }

    public Square() {
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
