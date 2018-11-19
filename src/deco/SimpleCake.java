package deco;

public class SimpleCake implements Cake {
    @Override
    public double getMultiplier() {
        return 1.0;
    }

    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "Cake";
    }
}
