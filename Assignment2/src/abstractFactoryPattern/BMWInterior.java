package abstractFactoryPattern;

public class BMWInterior implements Interior {

    private int seats;

    public BMWInterior() {
        this.seats = 5;
    }

    @Override
    public void showDetails() {
        System.out.println("BMW leather interior");
    }

    @Override
    public int getSeats() {
        return seats;
    }
}