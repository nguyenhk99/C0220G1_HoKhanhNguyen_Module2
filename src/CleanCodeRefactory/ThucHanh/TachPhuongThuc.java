package CleanCodeRefactory.ThucHanh;
public class TachPhuongThuc {
    public static double getVolume(int radius, int height) {
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;

    }
    public static void main(String[] args) {
        System.out.println(TachPhuongThuc.getBaseArea(5));
        System.out.println(TachPhuongThuc.getPerimeter(5));
        System.out.println(TachPhuongThuc.getVolume(5,10));
    }
}
