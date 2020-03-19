package Masha;


public class Food {
    private final String Name;
    private final double Count;

    public Food(String Name, double Count) {
        this.Name=Name;
        this.Count=Count;
    }

    public String getName() {
        return Name;
    }

    public double getCount() {
        return Count;
    }
}
