package deco;

public abstract class CakeDecorator implements Cake {
    protected final Cake decoratedCoffee;

    public CakeDecorator(Cake c) {
        this.decoratedCoffee = c;
    }

    public double getMultiplier() { // Implementing methods of the interface
        return decoratedCoffee.getMultiplier();
    }

    public double getCost() { // Implementing methods of the interface
        return decoratedCoffee.getCost();
    }

    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}

