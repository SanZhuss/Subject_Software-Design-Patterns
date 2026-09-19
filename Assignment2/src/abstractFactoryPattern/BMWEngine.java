package abstractFactoryPattern;

public class BMWEngine implements Engine{
    private int power;

    public BMWEngine(){
        this.power = 300;
    }

    @Override
    public void start(){
        IO.println("BWM engine started");
    }

    @Override
    public void stop(){
        IO.println("BWM engine stopped");
    }

    @Override
    public int getPower(){
        return power;
    }
}
