package Masha;

import java.io.Serializable;
import java.util.List;

public class Animal implements Serializable {
    private final KindAnimal Type;
    private final String Name;
    private final int Age;
    private final List<Food> listFood;


    public Animal(KindAnimal Type, String Name, int Age, List<Food> Food) {
        this.Type = Type;
        this.Name = Name;
        this.Age = Age;
        this.listFood = Food;
    }

    public String getName() {
        return Name;
    }

    public KindAnimal getType() {
        return Type;
    }

    public int getAge() {
        return Age;
    }

    public List<Food> getFoodList() {
        return listFood;
    }


}
