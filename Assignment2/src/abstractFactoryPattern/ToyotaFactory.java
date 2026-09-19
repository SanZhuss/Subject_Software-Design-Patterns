package abstractFactoryPattern;

public class ToyotaFactory implements CarFactory{
    @Override
    public Engine createEngine(){
        return new ToyotaEngine();
    }

    @Override
    public Wheel createWheel(){
        return new ToyotaWheel();
    }

    @Override
    public Interior createInterior(){
        return new ToyotaInterior();
    }
}
