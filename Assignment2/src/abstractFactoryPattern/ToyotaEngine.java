package abstractFactoryPattern;

public class ToyotaEngine implements Engine{
    private int power;

    public ToyotaEngine(){
        this.power = 180;
    }

    @Override
    public void start(){
        IO.println("Toyota engine started");
    }

    @Override
    public void stop(){
        IO.println("Toyota engine stopped");
    }

    @Override
    public int getPower(){
        return power;
    }

}
