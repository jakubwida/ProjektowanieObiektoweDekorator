package deco;

public class VanillaDecorator extends CakeDecorator {

    public VanillaDecorator(Cake c) {
        super(c);
    }

    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + (10 * super.getMultiplier());
    }

    public String getIngredients() {
        return super.getIngredients() + ", Vanilla";
    }

}
