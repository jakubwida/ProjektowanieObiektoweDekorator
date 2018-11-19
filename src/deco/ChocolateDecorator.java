package deco;

public class ChocolateDecorator extends CakeDecorator {

    public ChocolateDecorator(Cake c) {
        super(c);
    }

    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + (3*super.getMultiplier());
    }

    public String getIngredients() {
        return super.getIngredients() + ", Chocolate";
    }

}
