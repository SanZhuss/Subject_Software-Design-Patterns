public class Director {
    public House construct(Builder builder) {
        builder.buildWalls("4");
        builder.buildDoors("3");
        builder.buildWindows("5");
        builder.buildRooms("4");
        builder.buildSwimmingPool(false);
        builder.buildGarden(false);
        return builder.getResult();
    }
}
