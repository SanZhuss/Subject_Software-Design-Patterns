public class HybridEngine implements Engine{
    @Override
    public void startEngine(){
        IO.println("Starting hybrid engine...");
    }

    @Override
    public void stopEngine(){
        IO.println("Stopping hybrid engine...");
    }

    @Override
    public String getEngineType(){
        return "Hybrid Engine";
    }
}
