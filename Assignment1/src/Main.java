public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new RegularHouse();
        House regularHouse = director.construct(builder1);

        Builder builder2 = new HouseWithSwimmingPool();
        House houseWithSwimmingPool = director.construct(builder2);

        Builder builder3 = new HouseWithGarden();
        House houseWithGarden = director.construct(builder3);

        IO.println(regularHouse + "\n" + houseWithSwimmingPool + "\n" + houseWithGarden);
    }
}
