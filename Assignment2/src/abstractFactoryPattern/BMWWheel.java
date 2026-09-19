package abstractFactoryPattern;

public class BMWWheel implements Wheel {

    private int size;

    public BMWWheel() {
        this.size = 19;
    }

    @Override
    public void rotate() {
        System.out.println("BMW wheel is rotating");
    }

    @Override
    public int getSize() {
        return size;
    }
}
