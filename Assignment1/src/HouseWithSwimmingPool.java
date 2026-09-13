public class HouseWithSwimmingPool extends Builder{
    @Override
    public House build(){
        house.setHasSwimmingPool(true);
        return house;
    }
}
