public class ElectricEngine implements Engine{
    @Override
    public void startEngine(){
        IO.println("Starting electric engine...");
    }

    @Override
    public void stopEngine(){
        IO.println("Stopping electric engine...");
    }

    @Override
    public String getEngineType(){
        return "Electric Engine";
    }
}
