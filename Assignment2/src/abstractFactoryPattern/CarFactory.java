package abstractFactoryPattern;

public interface CarFactory {

    Engine createEngine();

    Wheel createWheel();

    Interior createInterior();

}
