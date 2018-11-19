package deco;

public class BigCake implements Cake {
    @Override
    public double getMultiplier() {
        return 2.0;
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
