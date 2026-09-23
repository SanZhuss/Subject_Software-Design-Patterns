import java.util.*;

public class Zoo {
    private final List<Animal> zoopark = new ArrayList<>();

    public void addAnimal(Animal animal){
        zoopark.add(animal);
    }

    public void accept(Visitor visitor){
        for(Animal animal : zoopark){
            animal.accept(visitor);
        }
    }
}
