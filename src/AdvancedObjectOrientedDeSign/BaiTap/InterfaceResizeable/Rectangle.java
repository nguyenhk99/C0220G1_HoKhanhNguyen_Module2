package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Rectangle implements Resizeable{
    private double size = 1;
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
