package builder;

public class Main {
    public static void main(String[] args){
//        DrinkDirector director = new DrinkDirector();
//
//        Drink Latte = director.makeLatte(new Coffee.Builder());
//        Drink cappuccino = director.makeCappuccino(new Coffee.Builder());
//        Drink matchaLatte = director.makeMatchaLatte(new Matcha.Builder());
//        Drink Americano = director.makeAmericano(new Coffee.Builder());
//
//        System.out.println("Latte: " + Latte);
//        System.out.println("Cappuccino: " + cappuccino);
//        System.out.println("MatchaLatte: " + matchaLatte);
//        System.out.println("Americano: " + Americano);
//        System.out.println(Latte.getSize());

        Drink defaultCoffee = DrinkFactory.createDrink("matcha");
        System.out.println(defaultCoffee);

        // Simple Factory
//        Drink simpleCoffee = DrinkFactory.createDrink("coffee");
//        System.out.println("Simple Factory Coffee: " + simpleCoffee);

        // Abstract Factory
        DrinkAbstractFactory coffeeFactory = new CoffeeFactory();
        Drink latte = coffeeFactory.createLatte();
        Drink cappuccino = coffeeFactory.createCappuccino();

        System.out.println("Abstract Factory Latte: " + latte);
        System.out.println("Abstract Factory Cappuccino: " + cappuccino);

        // Matcha через Abstract Factory
        DrinkAbstractFactory matchaFactory = new MatchaFactory();
        Drink matchaLatte = matchaFactory.createLatte();
        System.out.println("Abstract Factory Matcha Latte: " + matchaLatte);

    }
}
