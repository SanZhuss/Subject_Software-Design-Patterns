public class HouseWithGarden extends Builder{
    @Override
    public House build(){
        house.setHasGarden(true);
        return house;
    }
}
