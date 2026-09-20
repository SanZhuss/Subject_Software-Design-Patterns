public class GasolineEngine implements Engine{
    @Override
    public void startEngine(){
        IO.println("Starting gasoline engine...");
    }

    @Override
    public void stopEngine(){
        IO.println("Stopping gasoline engine...");
    }

    @Override
    public String getEngineType(){
        return "Gasoline Engine";
    }
}
