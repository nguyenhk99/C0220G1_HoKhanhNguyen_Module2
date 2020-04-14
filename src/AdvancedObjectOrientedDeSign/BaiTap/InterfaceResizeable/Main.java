package AdvancedObjectOrientedDeSign.BaiTap.InterfaceResizeable;

public class Main {
    public static void main(String[] args) {
       Resizeable[] resizeables = new Resizeable[3];
       resizeables[0] = new Circle();
       resizeables[1] = new Rectangle();
       resizeables[2] = new Square();

       for(int i = 0;i<resizeables.length;i++){
           resizeables[i].resize((Math.random()*99)+1);
       }

        for(int i = 0;i<resizeables.length;i++){
            System.out.println(resizeables[i].getSize());
        }
    }
}
