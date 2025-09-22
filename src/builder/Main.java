package builder;

public class Main {
    public static void main(String[] args){
        DrinkAbstractFactory coffeeFactory = new CoffeeFactory();
        Drink latte = coffeeFactory.createLatte();
        Drink cappuccino = coffeeFactory.createCappuccino();

        System.out.println("Abstract Factory Latte: " + latte);
        System.out.println("Abstract Factory Cappuccino: " + cappuccino);

        DrinkAbstractFactory matchaFactory = new MatchaFactory();
        Drink matchaLatte = matchaFactory.createLatte();
        System.out.println("Abstract Factory Matcha Latte: " + matchaLatte);

    }
}
