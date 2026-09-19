package abstractFactoryPattern;

public class ToyotaWheel implements Wheel{
    private int size;

    public ToyotaWheel(){
        this.size = 17;
    }

    @Override
    public void rotate(){
        IO.println("Toyota wheel is rotating");
    }

    @Override
    public int getSize(){
        return size;
    }
}
