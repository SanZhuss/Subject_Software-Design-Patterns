package abstractFactoryPattern;

public class ToyotaInterior implements Interior{
    private int seats;

    public ToyotaInterior(){
        this.seats = 5;
    }

    @Override
    public void showDetails() {
        IO.println("Toyota fabric interior");
    }

    @Override
    public int getSeats(){
        return seats;
    }
}
