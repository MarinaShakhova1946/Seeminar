package Masha;

import java.io.Serializable;
import java.util.List;

public class Animal implements Serializable {
    KindAnimal Type;
    String Name;
    int Age;
    List<Food> Food;

    public Animal(KindAnimal Type, String Name, int Age, List<Food> Food) {
        this.Type = Type;
        this.Name = Name;
        this.Age = Age;
        this.Food = Food;
    }


}
