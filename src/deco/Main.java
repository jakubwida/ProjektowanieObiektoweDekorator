package deco;


public class Main {

    public static void main(String[] args) {

        System.out.println("Pricing: Base 5, vanilla 10, chocolate 3, size frosting multiplier: regular = 1, big = 2");
        System.out.println("regular vanilla");
        Cake simpleVanilla = new VanillaDecorator(new SimpleCake());
        System.out.println(simpleVanilla.getCost());
        System.out.println(simpleVanilla.getIngredients());
        System.out.println("big vanilla chocolate");
        Cake bigVanillaChocolate = new ChocolateDecorator(new VanillaDecorator(new BigCake()));
        System.out.println(bigVanillaChocolate.getCost());
        System.out.println(bigVanillaChocolate.getIngredients());
    }
}
